package pack03;

import pack01.A;

//private는 Class 내부에서의 공유이기떄문에 Class앞에 붙일수없음
// ㄴ 멤버에만 사용
public class D {
	D publicD = new D();
	D defaultD = new D(1);
	D privateD = new D("A");
	A pack1_A = new A();
	//패키기지는 클래스를 유일하게 구별하게 만드는 식별자
	pack03.A pack3_A = new pack03.A();
	
	public D() {
		System.out.println("public , 파라메터 x");
	}
	D(int param){
		System.out.println("default , 파라메터 x");
	}
	private D(String param) {
		System.out.println("private , 파라메터x");
	}
}
