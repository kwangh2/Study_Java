package exam.changetp;

public class ChangeTypeMain {
	public static void main(String[] args) {
		A a = new A();
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		
		a.aMethod();
		
//		B b = new B();
//		B b1 = new C();
//		B b2 = new D();
//		B b3 = new E();
		C c =new C();
		c.cMethod();
		E e = (E) c;
		e.eMethod();
	}
}
