package pack02.an;

public class TestMain {
	public static void main(String[] args) {
		TestClass tc = new TestClass() {
			int testField2 = 30;
			
			//익명 지역
			@Override
			void testMethod() {
				//super.testMethod();
				System.out.println("익명 지역 메소드 " + testField2);
			}
		};
		tc.testField = 1;
		tc.testMethod();
		
		TestInterface ti = new TestInterface() {
			int num = 1;
			@Override
			public void method() {
				System.out.println("인터페이스 인스턴스화" + num);		
			}
		};
		
		ti.method();
	}
}
