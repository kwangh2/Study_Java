package pack07.test;

import java.util.Random;
import java.util.Scanner;

public class Ex_DiceGame {
	public static void main(String[] args) {
		// Random함수 이용해서 enter key를 누를때 컴퓨터 번호생성, 사용ㅇ자 번호생성 비교 승,패,무승부
		while (true) {
			Random random = new Random();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter key를 누르면 PC가 주사위를 굴립니다.");
			sc.nextLine();
			int pcNum = random.nextInt(6) + 1;
			System.out.println("enter key를 누르면 user가 주사위를 굴립니다.");
			sc.nextLine();
			int userNum = random.nextInt(6) + 1;
			if (pcNum > userNum) {
				System.out.println(pcNum + ">" + userNum + "pc 승");
			} else if (userNum > pcNum) {
				System.out.println(pcNum + "<" + userNum + "유저 승");
			} else {
				System.out.println(pcNum + "=" + userNum + "무승부");
			}
		}
	}
}
