package Chuseok;

import java.util.Scanner;

public class CS_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dataA 입력");
		int dataA = sc.nextInt();
		System.out.println("dataB 입력");
		int dataB = sc.nextInt();
// 왜안되지		for (int i = dataA>dataB?dataB:dataA ; i <= dataA>dataB?dataA:dataB ; i++) {
//			System.out.print(i);
//			sum += i;
//			while (i < dataA) {
//				System.out.print("+");
//				break;
//			}
//		}System.out.print("=" + sum);
		if (dataA >= dataB) {
			int sum = 0;
			for (int i = dataB ; i <= dataA ; i ++) {
				System.out.print(i);
				sum += i;
				while(i<dataA) {
					System.out.print("+");
					break;
				}
			} System.out.print("=" + sum);

		}else {
			int sum = 0;
			for (int i = dataA ; i <= dataB ; i ++) {
				System.out.print(i);
				sum += i;
				while(i<dataB) {
					System.out.print("+");
					break;
				}
			} System.out.print("=" + sum);
		}
	}
}
