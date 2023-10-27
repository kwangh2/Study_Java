package 자바응용문제;

import java.util.Scanner;

public class MemberService {
	Scanner sc = new Scanner(System.in);
	private String userId, userPw;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public boolean login(String id, String pw) {
		if (id.equals("hong") && pw.equals("12345")) {
			setUserId(id);
			setUserPw(pw);
			return true;
		}
		return false;
	}
	public void logout(String input) {
		System.out.println("id를 입력하면 로그아웃");
		input = sc.nextLine();
		if (input.equals(getUserId())) {
			System.out.println("로그아웃 되었습니다");
		}else {
			System.out.println("해당 아이디는 로그인되지않았습니다.");
		}
	}
}
