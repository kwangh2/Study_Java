package common;
import java.util.Scanner;

import member.MemberDTO;
import product.ProductDTO;

public class Common {
	public Scanner sc;
	public MemberDTO loginInfo;//로그인 성공시 배열(DAO)에 있는 정보 중 하나의 데이터를 저장해둠
	public ProductDTO[] items; //최초 main메소드에서 상품을 초기화 해두고 올림.
	
	//1. 숫자형태를 입력받아야할때.
	//	1.1 + 메세지
	//	1.2 값체크
	// 2.문자열 입력
	
	public String getStrScanner(String msg) {
		System.out.println(msg);
		return getStrScanner();
	}//
	
	public MemberDTO getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(MemberDTO loginInfo) {
		this.loginInfo = loginInfo;
	}

	public String getStrScanner() {
		return sc.nextLine();
	}
	
	public String getStrScanner(int checkValue) {
		while(true) {
			String value = sc.nextLine();
			if(value.length() > checkValue) {
				return value;
			}else {
				System.out.println(checkValue + "보다 큰 글자수 입력!");
			}
		}
	}
	
	public int getIntScanner() {
		while(true) {
			try {
				return Integer.parseInt(sc.nextLine());
			}catch (Exception e) {
				System.out.println("숫자만 입력!");
			}
		}//사용자가 숫자입력을 할때까지 무한반복
	}
	
	public int getIntScanner(int checkValueMin , int checkValueMax) {
		while(true) {
			int value = getIntScanner();
			if(checkValueMax>= value && value >= checkValueMin) {
				return value;
			}else {
				System.out.println(checkValueMin + "~" + checkValueMax + "사이 값 입력");
			}
		}
	}
	
	public int getIntScanner(int checkValue) {
		while(true) {
			int value = getIntScanner();
			if(value > checkValue) {
				return value;
			}else {
				System.out.println(checkValue + "보다 큰 값 입력");
			}
		}
	}
	public Common() {
		sc = new Scanner(System.in);
	}// 통신열기

	public void endProgram() {
		if (sc != null) {
			sc.close();
		}
		sc = null;
	}// 통신 닫기
}
