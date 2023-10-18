package exam.testprotected1;

public class B {
	public B() {
		
	}
	
	public void intiA() {
		A a = new A();
		a.protected_field4 = 4; //protected가 같은 패키지 내부에서 사용이 가능함.
	}
	public A rtnA() {
		return new A();
	}
	public int rtnAfield() {
		A a = new A();
		return a.protected_field4;
	}
}
