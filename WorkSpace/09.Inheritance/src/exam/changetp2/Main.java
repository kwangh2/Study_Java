package exam.changetp2;

public class Main {
	public static void main(String[] args) {
		Child child = new Child();
//		child.parentMethod1();
		Parent parent = child;
		parent.method1();
		parent.method2();
		parent = new Child2(); 
		parent.method1();
		parent.method2();
		//Parent 라는 더 큰 범위안에 다양한 자식클래스를 빠궈가면서 사용하는게 가능함.
		//실직적으로 Parent 하나만 메모리에 있고, 내부에 있는 메소드 구조를 유연하게 빠궈가면서 사용이 가능
	}
}
