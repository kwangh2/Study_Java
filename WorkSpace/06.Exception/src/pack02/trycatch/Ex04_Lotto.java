package pack02.trycatch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04_Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] userLotto = new int[6];
		int[] Lotto = new int[6];
		int right = 0;
		for (int i = 0; i < userLotto.length; i++) {
			System.out.println("번호를 입력하세요");
//			String userNum = sc.nextLine();
			int userLottoNum = Integer.parseInt(sc.nextLine());
			userLotto[i] = userLottoNum;
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (userLotto[i] < userLotto[j]) {
					int num;
					num = userLotto[i];
					userLotto[i] = userLotto[j];
					userLotto[j] = num;
				}
			}
		}
		System.out.println(Arrays.toString(userLotto));
		for (int i = 0; i < Lotto.length; i++) {
			Random random = new Random();
			int randomNum = random.nextInt(45) + 1;
			Lotto[i] = randomNum;
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (Lotto[i] < Lotto[j]) {
					int num;
					num = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = num;
				}
			}
		}
		System.out.println(Arrays.toString(Lotto));
		for (int i = 0; i<6; i++) {
			if(Lotto[i] == userLotto[i]) {
				right += 1;
			}else {
				continue;
			}
		}System.out.println("맞춘 번호 수 : "+  right);
	}
}
