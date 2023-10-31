package pack01.testthread;

import java.awt.Toolkit;
import java.util.Iterator;

public class Ex02_Thread {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				// 실제 작업을 처리할 코드
				for (int i = 0; i < 5; i++) {
					Toolkit.getDefaultToolkit().beep();
					System.out.println("출격");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
//		Thread thread = (Thread) run;
		Thread thread = new Thread(run);
		thread.start();
		System.out.println("요기는 메인메소드 스레드 코드 ");
		
	}
	
}
