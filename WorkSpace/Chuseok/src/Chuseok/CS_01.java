package Chuseok;

import java.util.Scanner;

public class CS_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iData = sc.nextInt();
		switch (iData) {
		case 1:
			System.out.println("남자입니다");
			break;
		case 2:	
			System.out.println("여자입니다");
			break;
		default:
			System.out.println("입력오류입니다");
			break;
		}
	}
}
