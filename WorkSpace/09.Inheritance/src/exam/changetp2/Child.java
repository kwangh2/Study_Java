package exam.changetp2;

public class Child extends Parent{
	@Override
	public void method1() {
		System.out.println("자식메소드1");
		super.method1();
	}
	public void method2() {
		System.out.println("자식메소드2");
		
	}
}
