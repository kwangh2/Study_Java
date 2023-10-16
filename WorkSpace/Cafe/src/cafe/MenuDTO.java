package cafe;

import java.util.Arrays;

public class MenuDTO {
	//로그인 - 사용자(디폴트) or 관리자(특정방법)
	//ID,PW - String 
	//메뉴,가격 - Array - 아메리카노 - 2000원 / 카푸치노 - 3000원 / 카페라떼 - 3500원 
	//개인정보수정 - PW만 수정 가능
	//사용자일때 - 개인정보수정 or 금액입력
	//금액입력 -> 메뉴 선택 -> 잔돈반환 -> 이전으로
	//개인정보수정 -> 수정 ->이전으로

	// 관리자
	//다 선택할수있게 마지막은 이전으로.
	//메뉴 
		private String Name, price;
 		private int money, refund,  num;
		int menuList;
		String[] newMenu = {null,null,null};
		String[] menu1 = {"1", "아메리카노" , "2000"};
		String[] menu2 = {"2", "카푸치노" , "3000"};
		String[] menu3 = {"3", "카페라떼" , "3500"};
		String[][] allmenu = {menu1 , menu2, menu3};
		

		public int getMenuList() {
			return menuList;
		}
		public void setMenuList(int menuList) {
			this.menuList = menuList;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		public int getRefund() {
			return refund;
		}
		public void setRefund(int refund) {
			this.refund = refund;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
	
}

