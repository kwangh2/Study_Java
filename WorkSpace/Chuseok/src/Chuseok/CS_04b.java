package Chuseok;

import java.util.Scanner;

public class CS_04b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dataA 입력");
		int dataA = sc.nextInt();
		System.out.println("dataB 입력");
		int dataB = sc.nextInt();
		int sum = 0;
		for (int i = dataB ; i <= dataA ; i++) {
			System.out.print(i);
			sum += i;
			while (i < dataA) {
				System.out.print("+");
				break;
			}
		}System.out.print("=" + sum);
	}
}
