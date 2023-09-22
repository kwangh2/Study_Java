package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Dicegame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임시작 : 1 / 게임종료 : -1");
		String Start = sc.nextLine(); // 게임 시작 or 종료
		while (true) {
			int StartInt = Integer.parseInt(Start);
			if (StartInt == 1) {
				// 게임 시작
				while (true) {
					System.out.println("Computer's turn! Press 'Enter'");
					Random random = new Random(); // 컴퓨터 주사위 굴리기
					sc.nextLine();
					int randonComDice = random.nextInt(6) + 1;
					System.out.println(randonComDice);
					System.out.println("Your turn! Press 'Enter'");
					sc.nextLine();
					int randomHumanDice = random.nextInt(6) + 1;
					System.out.println(randomHumanDice);
					if (randomHumanDice > randonComDice) {
						System.out.println("승리! 재도전 : 1 / 종료 : -1");
					} else if (randonComDice > randomHumanDice) {
						System.out.println("패배! 재도전 : 1 / 종료 : -1");
					} else {
						System.out.println("무승부! 재도전 : 1 / 종료 : -1");
					
					}
					if (Integer.parseInt(sc.nextLine()) == 1) {
						continue;
					} else {
						break;
					}
				}
			} else if (StartInt == -1) {
				// 게임선택종료
				System.out.println("종료 ㅠ");
				break;
			} else if (StartInt == 9999) {
				System.out.println("Computer's Turn! press 'Enter'");
				sc.nextLine();
				Random random = new Random(); // 컴퓨터 주사위 굴리기
				int randonComDice = random.nextInt(5) + 1;
				System.out.println(randonComDice);
				System.out.println("Your Turn! press \'Enter\'");
				sc.nextLine();
				System.out.println(randonComDice + 1);
				System.out.println("승리! Continue : 1 / Break : -1");
				String continueNum = sc.nextLine();
				int continueNum1 = Integer.parseInt(continueNum);
				if (continueNum1 == 1) {
					continue;
				} else if (continueNum1 == 0) {
					break;
				}
			} // 치트키게임
			else {
				System.out.println("누르란 것만 누르세요");
				continue;
			}break;
		}
	}
}
