package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Extreme_HighLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*^^* 하기는 쉬운데 만들기는 어려운 하이로우 *^^*");
		System.out.println("게임 시작은 1 / 종료는 0 *^^*");
		String str = sc.nextLine();
		int gameStart = Integer.parseInt(str);
		if (gameStart == 1) {
			while(gameStart == 1) {
			System.out.println("난이도 1~10 중에 설정해주세요!");
			String hell = sc.nextLine();
			int hell1 = Integer.parseInt(hell);
			Random random = new Random();
			int randonNumber = random.nextInt(100^hell1)+1;
			System.out.println("정답을 입력해주세요 ^^ 기회는 10번입니다!");
			for(int i = 1; i<=10 ; i++) {
				String answer = sc.nextLine();
				int answerNum = Integer.parseInt(answer);
				if(answerNum == randonNumber ) {
					System.out.println("정답입니다!");
				}
				else if (answerNum > randonNumber){
					System.out.println("High");
				}else {
					System.out.println("Low");
				}
			}
			System.out.println("game over T.T 재시작은 1 / 종료는 0");
			String contin = sc.nextLine();
			int continu = Integer.parseInt(contin);	
				if(continu == 1) {
					continue;
				}else if (continu == 0) {
					break;
				}
		}//while
			}//게임가동
		else if(gameStart == 0) {
			System.out.println("ㅜㅜ");
		}//게임종료
		System.out.println("게임종료");
	}
}
