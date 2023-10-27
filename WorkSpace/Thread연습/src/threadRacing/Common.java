package threadRacing;

import java.util.Scanner;

public class Common {
	DTO dto = new DTO();
	Scanner sc = new Scanner(System.in);
	public void start() {
		System.out.println("경주마 갯수를 입력해주세요 / 2~5");
		dto.horses = Integer.parseInt(sc.nextLine());
		
	}
}
