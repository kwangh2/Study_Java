package Chuseok;

import java.util.Scanner;

public class CS_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("iData 입력");
		int iData = sc.nextInt();
		String star = "★";
		//int sum;
		for (int i = 0; i < iData; i++) {
		//	System.out.print(star);
			for (int j = 0 ; j <= i ; j++) {
				System.out.print(star);
			}System.out.println();
		}
	}
}
