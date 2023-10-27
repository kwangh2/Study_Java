package pack03.test;

import java.util.Scanner;

public class HorseGameMain {
	public static void main(String[] args) {
		new Thread(()->{
			//slide하는 메소드 
		}).start();
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int inputNum = Integer.parseInt(sc.nextLine());
			if(inputNum >= 2 && inputNum <= 5) {
				HorseDAO dao = new HorseDAO(inputNum);
				break;
			}
		}
	}
	
}
