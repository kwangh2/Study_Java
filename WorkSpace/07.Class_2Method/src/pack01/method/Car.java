package pack01.method;

import java.security.PublicKey;

public class Car {
String company;
String model;
String engine;
String carType;
int num;
//	public void jkhMethod() {
////		System.out.println("void형태는 return타입 없음. ??");
////		System.out.println("현재 메소드는 클래스의 블럭킹 내부에 있다 ");
////		System.out.println("↑ jkhMethod는 클래스의 멤버, 인스턴스 멤버");
////	}
////	//파라메터,매개변수 (메소드 동작시 필요한 값이 있다면 『뭐든』 받아올수잇음
////	//변수 선언 (받아오기 위한 그릇)
////	public void secondMethod(String name) {
////		System.out.println(name + " 이 공부중");
////	}
////	public void thirdMethod(String name, String state) {
////		System.out.println(name + " 이 " + state + "중");
//		
//	}
	public void carMethod(String company , String model) {
		this.company = company;
		this.model = model;
		System.out.println(company + " " + model);
	}
	public void carSecondMethod(String carType, String engine) {
		this.engine = engine;
		this.carType = carType;
	}
	public void hard(int num) {
		this.num = num ;
		for (int i = 0 ; i < num ; i ++) {
			System.out.print("출력");
		}
	}
	public int rtnMethod1() {
		return 1;
		
	}
}
