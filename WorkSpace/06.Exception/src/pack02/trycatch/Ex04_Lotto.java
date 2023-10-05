package pack02.trycatch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04_Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] userNum = new int[6];
		int[] Lotto = new int[6];
		int[] userRandomLotto = new int[6];
		int right = 0;
		Random random = new Random(); // 랜덤한 숫자를 생성하기위한준비
		System.out.println("자동 - 0 // 수동은 1");
		int select = Integer.parseInt(sc.nextLine());
		if (select == 1) {
			for (int i = 0; i < userNum.length; i++) {
				System.out.println("번호를 입력하세요");
				int userNumNum = Integer.parseInt(sc.nextLine());
				userNum[i] = userNumNum;
				if (userNum[i] < 1 || userNum[i] > 45) {
					System.out.println("다시입력");
					i--;
					continue;
				}
				for (int j = 0; j < i; j++) {
					if (userNum[i] == userNum[j]) {
						System.out.println("다시");
						i--;
						break;// ?
					}
				}
				for (int j = 0; j < 6; j++) {
					if (userNum[i] < userNum[j]) {
						int num;
						num = userNum[i];
						userNum[i] = userNum[j];
						userNum[j] = num;
					}
				}
			}		System.out.println(Arrays.toString(Lotto));

			for (int i = 0; i < 6; i++) {
				if (Lotto[i] == userNum[i]) {
					right += 1;
				}
			}
		}
		if (select == 0) {
			for (int i = 0; i < Lotto.length; i++) {
				int userRandom = random.nextInt(45) + 1;
				userRandomLotto[i] = userRandom;
				for (int j = 0; j < i; j++) {
					if (userRandomLotto[i] > userRandomLotto[j]) {
						int num;
						num = userRandomLotto[i];
						userRandomLotto[i] = userRandomLotto[j];
						userRandomLotto[j] = num;
					}
				}
			}System.out.println(Arrays.toString(userRandomLotto));
			for (int i = 0; i < 6; i++) {
				if (Lotto[i] == userNum[i]) {
					right += 1;
				}
			}
		}
	
		for (int i = 0; i < Lotto.length; i++) {
			int randomNum = random.nextInt(45) + 1;
			Lotto[i] = randomNum;
			for (int j = 0; j < i; j++) {
				if (Lotto[i] == Lotto[j]) {
					i--;
					continue;
				}
			}
			for (int j = 0; j < 6; j++) {
				if (Lotto[i] < Lotto[j]) {
					int num;
					num = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = num;
				}
			}
		}

		System.out.println("맞춘 번호 수 : " + right);
	}
}
