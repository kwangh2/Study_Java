package 응용문제2;

import java.util.Random;
import java.util.Scanner;

public class Arr {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	ArrDTO dto = new ArrDTO();

	public void start() {
		System.out.println("난이도입력 1~");
		int temp = sc.nextInt();
		dto.num = new int[temp];
		shuffle();
	}

	public void shuffle() {
		int temp = random.nextInt(dto.num.length);
		dto.num[temp] = 10;
		answer();
	}

	public void answer() {
		System.out.println("정답을 입력하세요");
		int count = 0;
		int temp = sc.nextInt()-1;
		while (true) {
			++count;
			if (dto.num[temp] == 10) {
				System.out.println("정답입니다 " + count + "회 시도했습니다!");
				
				break;
			} else {				System.out.println("오답입니다 다시 입력해주세요");
				temp = sc.nextInt()-1;
				
			}
		}

	}

}
