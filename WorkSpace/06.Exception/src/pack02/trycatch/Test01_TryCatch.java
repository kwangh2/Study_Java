package pack02.trycatch;

import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			String intNum = sc.nextLine();
			try {

				int num1 = Integer.parseInt(intNum);

				if (num1 == -1) {
					System.out.println("종료");
					break;
				} else {
					sum += num1;
					System.out.println("누적값 : " + sum);
				}

			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력!");

			} catch (Exception e) {
				System.out.println("잘못된 입력!!");
			}
		}

	}
}
