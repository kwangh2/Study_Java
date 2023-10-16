package member;

public class MemberDTO {
	private String id , pw, name , nickname;
	private int money;
	private boolean isAdmin; //데이터가 true면 관리자 else면 사용자 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

//	public void setAdmin(boolean isAdmin) {
//		this.isAdmin = isAdmin;
//	}

	public MemberDTO(String id, String pw, String name, String nickname, boolean isAdmin) {//관리자 데이터
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
		this.isAdmin = isAdmin;
	}

	public MemberDTO(String id, String pw, String name, String nickname) {//사용자 데이터 
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
	}
}
