package pack03.test;

import java.util.Scanner;

public class FileDownTaskMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( " d");
		while (true) {
			String inputData = sc.nextLine();
			if(inputData.equals("-1")) {
				System.out.println("프로그램 중단");
				break;
			}
			FileDownTask task = new FileDownTask(inputData);// TEST => Scanner이용
			task.start();
		}
		sc.close();
	}
}
