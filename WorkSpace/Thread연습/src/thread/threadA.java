package thread;

import java.util.Iterator;
import java.util.Scanner;

public class threadA extends Thread {
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		int temp = Integer.parseInt(sc.nextLine());
		for (int i = temp; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
