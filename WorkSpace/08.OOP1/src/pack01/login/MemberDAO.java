package pack01.login;

public class MemberDAO {
	public int login(MemberDTO dto) {
		if (dto.userId.equals("admin") && dto.userPw.equals("admin1234")) {
			System.out.println("로그인 되었습니다");
			return 1;
		}else {
			System.out.println("아이디 또는 비밀번호를 확인해주세요.");
			return 0;
		}
	}
}
