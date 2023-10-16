package cafe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeMain {
	public static void main(String[] args) {
		CafeDAO cafeDao = new CafeDAO();
		MenuDTO menuDto = new MenuDTO();
//		System.out.println(cafeDao.manageOption());
		System.out.println("환영합니다. ID , PW 입력해주세요");
		while (true) {
			cafeDao.login();
			if (cafeDao.idNum == 0) { // 관리자 모드
				int ret = cafeDao.manageOption();
				if(ret == 1) {
				cafeDao.manage();
				
				}else if(ret == 0){
					cafeDao.managerPw();
				}else if(ret == 2) {
					cafeDao.menuPlus();
				}else {
					//메뉴 삭제
				}
				
			} else {
				try {
				cafeDao.customer();	
				} catch (InputMismatchException e) {
					System.out.println("숫자를 입력해주세요");
					continue;
				}
				// 사용자모드}
				
				if (cafeDao.idNum == 0) {//비밀번호변경 
					cafeDao.option();
				}

			}
			if (cafeDao.idNum > 0) {// 구매
				cafeDao.purchase();
			}else {
				
			}//정보수정 
		} // 무한 반복 ㄱㄱ
	}
}
