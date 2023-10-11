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
	public void iMethod() {
		System.out.println(iField + "인스턴스메소드" + sField);
	}
	public void iMethod(int param) {
		System.out.println("파라메터 1개");
	}
	public void iMethod(String param) {
		System.out.println("String");
	}
	public void iMethod(String param , int param2) {
		System.out.println(param + param2);
	}
}
