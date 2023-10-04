package Chuseok;

import java.util.Scanner;

public class CS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID 입력");
		String userId = sc.nextLine();
		System.out.println("PW 입력");
		String userPw = sc.nextLine();
		System.out.println("로그인 중입니다.");
		if (userId.equals("admin")) {
			if (userPw.equals("admin1234")) {
				System.out.println("관리자님 환영합니다!");
			}else {
				System.out.println("잘못된 접근입니다!");
			}
		}
	}
}
