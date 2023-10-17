package exam.testextends2;

public class SubClass extends SuperClass {
	
	public SubClass() {
		System.out.println("자식 클래스 생성자");
	}
	
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return super.sum(x, y)+1;
	}
	public int mul (int x , int y) {
		return x * y;
	}
	public int div (int x , int y) {
		return x / y;
	}	
}
