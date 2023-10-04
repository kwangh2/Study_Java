package Chuseok;

import java.util.Scanner;

public class CS_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dataA 입력");
		int dataA = sc.nextInt();
		System.out.println("dataB 입력");
		int dataB = sc.nextInt();
		if (dataA > dataB) {
			System.out.println("dataA : " + dataA + " >  dataB : " + dataB);
		}else if (dataA < dataB) {
			System.out.println("dataA < dataB");
		}else {
			System.out.println("dataA = dataB");
		}
	}
}
