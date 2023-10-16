package common;
import member.MemberDAO;
import product.ProductDAO;

public class ProgramMain {
	//common <- 공통으로 사용 클래스 (메소드,변수)
	//프로그램 메인 -> 멤버 -> 상품구매
	public static void main(String[] args) {
		Common common = new Common();
		MemberDAO dao = new MemberDAO(common);
		common.items = new ProductDAO(common).initItems();//1회용 
		dao.startUserLogin();
		
		common.endProgram(); // 스캐너 종료 
	}
}
