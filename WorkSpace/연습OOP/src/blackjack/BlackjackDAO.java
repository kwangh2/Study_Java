package blackjack;

import java.util.Random;
import java.util.Scanner;

public class BlackjackDAO {
	//2명의 플레이어
	//랜덤으로 숫자를 뽑고
	// 16이하면 반드시 한장을뽑고
	// 17이상이면 카드 추가 x
	//딜러와 게이머중 소유한 값이 21에 가장 가까운쪽이 승리한다
	//21을 초과하면 패배
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	int cardNum;
	
	public void startGame() {
		while(true) {
		int temp = 0;
		System.out.println("게임시작 - 1 / 게임종료 - 0");
		try {
		temp = Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요");
		}
		if (temp == 1) {
			System.out.println("게임을 시작합니다");
			//게임 메소드
		}else if(temp ==0) {
			System.out.println("게임을 종료합니다");
			break;
		}else {
			System.out.println("1 또는 0을 입력해주세요 ");
		}
		}
	}
	
	public void name() {
		
	}
	
}
