package pack02.member;

public class Member {
	int iField;
	static int sField;
	public void iMember() {
		System.out.println("iMember On" + iField + sField);
	}
	public static void sMethod() {
		Member member = new Member();
		System.out.println("sMember On" + sField + member.iField);
	}
}
