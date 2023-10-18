package exam.changetp3;

public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Child();
		//객체를 생성할때 사용된 인스턴스 : instanceof -> 사용된 인스턴스를 비교하여 강제형변환 가능여부 확인
		
		child = (Child) parent;
		
			System.out.println(child instanceof Parent);
			//parent = child;
			System.out.println(parent instanceof Child);
			//
			child = (Child) parent;
		
//		parent = child;
//		parent.method1();
//		parent.method2();
//		System.out.println("부모클래스 = 자식클래스 가능");
//		child = (Child) parent;
//		child.method1();
//		child.method2();
//		child.method3();
		
	}
}
