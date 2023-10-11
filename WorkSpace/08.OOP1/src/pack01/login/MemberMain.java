package pack01.login;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO();
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		dto.userId = sc.nextLine();
		dto.userPw = sc.nextLine();
		if(dao.login(dto) == 1) {
			System.out.println("화면이동");
		}else {
			System.out.println("다시 입력");
		}
		sc.close();
		
	}
}
