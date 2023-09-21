package pack05.etc;

import java.util.Scanner;

public class Ex02_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너의 초기화 식 : int i = 1;
	    // int i = sc.nextInt();
		String intputData = sc.nextLine();//사용자가 콘솔창에 입력을 하다가 enter키를 치면, 입력된 데이터를 전부 가져옴.
		System.out.println("사용자가 입력 : " + intputData );
		//blockStatae : 입력을 대기한다. (프로그램은 위에서 아래로 흐름)
		// int intputInt = sc.nextInt(); <= 사용금지
		//sc.nextLine() 은 사용자가 입력한 값을 '반드시' String 형태로 우리한테 되돌려줌.
		System.out.println("아이디를 입력해주세요");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String userPw = sc.nextLine();
		System.out.println("입력한 정보" + userId + userPw);
		// sc.nextLine == 내가 엔터친 개수 , nextLine 개수만큼 엔터 칠떄까지 콘솔 대기
	}
}
