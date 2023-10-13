package cafe;

import java.util.Arrays;
import java.util.Scanner;

public class CafeDAO {
	Scanner sc = new Scanner(System.in);
	MenuDTO menuDto = new MenuDTO();
	InfoDTO infoDto = new InfoDTO();
	int idNum;

	public void login() { // 로그인

		while (true) {
			System.out.println("Id 입력");
			String inputId = sc.nextLine();
			System.out.println("Pw 입력");
			String inputPw = sc.nextLine();

			if (inputId.equals(infoDto.getUserId()) && inputPw.equals(infoDto.getUserPw())) {
				// 사용자 모드 식 대입
				idNum = 1; // 식별 숫자
				System.out.println("사용자모드");
				break;
			} else if (inputId.equals(infoDto.getManagerId()) && inputPw.equals(infoDto.getManagerPw())) {
				System.out.println("관리자 모드"); // 관리자 모드
				// 관리자 모드 식 대입
				idNum = 0;
				break;
			} else {
				System.out.println("ID PW 확인해주세요");
			}
		} // 로그인 반복 메소드 끝
	} // 로그인 메소드 끝

	public void customer() { // 정보 수정 or 돈 투입
		System.out.println("금액을 투입해주세요");
		System.out.println("회원 정보수정은 0");
		idNum = (sc.nextInt());
		sc.nextLine();
		menuDto.setMoney(idNum);
	}// 수정/돈 선택 메소드 끝

	public void purchase() {
		System.out.println("메뉴를 선택해주세요");
		for (int i = 0; i < menuDto.allmenu.length; i++) {
			System.out.println(Arrays.toString(menuDto.allmenu[i]));
		} // 메뉴선택

		int choose = sc.nextInt() - 1;
		int price = Integer.parseInt(menuDto.allmenu[choose][2]);
		// 상품선택
//		System.out.println(price);
		// 상품 구매
		// 추가 구매 or 종료
		System.out.println("잔돈 : " + (menuDto.getMoney() - price));
		// 잔돈 반환
		System.out.println("처음으로.");
	}

	public int manageOption() {
		System.out.println("메뉴수정은 1 / 정보수정은 0");
		int tempNum = sc.nextInt();
		sc.nextLine();
		if (tempNum == 1) {
			return 1;
		}else {
			return 2;
		}
			
	} 

	public void manage() { // 관리자 모드
		System.out.println("메뉴를 선택해주세요");
		for (int i = 0; i < menuDto.allmenu.length; i++) {
			System.out.println(Arrays.toString(menuDto.allmenu[i]));
		} // 메뉴선택
		int choose = sc.nextInt() - 1;
		sc.nextLine();
		int chooseSub = sc.nextInt();
		sc.nextLine();
//		int price = Integer.parseInt(menuDto.allmenu[choose][chooseSub]);
		menuDto.allmenu[choose][chooseSub] = sc.nextLine();

	}

	public void option() {
		System.out.println("비밀번호를 변경하세요");
		String pw = sc.nextLine();
		infoDto.setUserPw(pw);
		System.out.println(infoDto.getUserPw());
		System.out.println("변경되었습니다");
	}
	public void managerPw() {
		System.out.println("비밀번호를 변경하세요");
		String pw = sc.nextLine();
		infoDto.setManagerPw(pw);
		System.out.println("변경되었습니다");
	}
	public void optionMenu() {
		System.out.println("새로만들기 - 1 / 지우기 - 0");
		int tempN = sc.nextInt();
		sc.nextLine();
		if(tempN == 1) {
			
		}else {
		
		}
	}//상품 추가,삭제 선택
	public void menuPlus() {
		System.out.println(menuDto.allmenu.length);
		
	}
	
}
