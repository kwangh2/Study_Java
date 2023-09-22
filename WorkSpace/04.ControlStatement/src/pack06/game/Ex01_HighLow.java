package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임시작하려면 0, 종료는 -1을 입력해주세요.");
		String Start = sc.nextLine();//시작
		int StartStop = Integer.parseInt(Start);
		if (StartStop == 0) {
		System.out.println("하이로우게임입니다. 최대치 숫자를 입력해주세요");
		String str = sc.nextLine();
		int intStr = Integer.parseInt(str);
		Random random = new Random();
		int randonNumber = random.nextInt(intStr) + 1; // 0~99 -> 1~100
		System.out.println("정답을 입력해주세요");
		int i = 0;
		while (true) {
			i = i + 1;
			String highlow = sc.nextLine();
			int inthighlow = Integer.parseInt(highlow);
			if (inthighlow == randonNumber) {
				System.out.println("정답");
				break;
			} else if (inthighlow > randonNumber) {
				System.out.println("High");
			} else {
				System.out.println("Low");}
			}
		
		}else {
			System.out.println("게임종료");
		}
		
	}
}
