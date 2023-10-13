package cafe;

public class CafeMain {
	public static void main(String[] args) {
		CafeDAO cafeDao = new CafeDAO();
		MenuDTO menuDto = new MenuDTO();
		System.out.println("환영합니다. ID , PW 입력해주세요");
		while (true) {
			cafeDao.login();
			if (cafeDao.idNum == 0) { // 관리자 모드
				if(cafeDao.manageOption() == 1) {
				cafeDao.manage();
				}else {
					cafeDao.managerPw();
				}
				
			} else {
				cafeDao.customer();
				// 사용자모드
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
