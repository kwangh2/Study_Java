package pack01.variable;

public class Ex01_Variable {
	public static void main(String[] args) {
		// 변수라는 것은 값을 저장하기 위한 것.
		// 변수의타입 변수이름 ;
		// ; - 변수의 선언 : 이타입의 변수를 해당 이름으로 사용할 것을 미리 알려줌.
		//변수에 값 할당 : 변수명 = 변수타입에 맞는 값
		int 변수;
		변수 = 10;
		System.out.println(변수);
		
		int x;
		int y;
		int z;
		x = 5;
		y = 10;
		z = 15;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z^2);
		System.out.println(x +","+y+","+z);
		// 블럭킹 내부에서는 같은 이름의 변수는 선언이 불가능하다
		// 변수이름 규칙 : 첫번쨰 글자는 소문자로 시작하고 의미있는 단어들을 연결해서 사용
		// 단어들의 연결은 대문자로 구분한다.
		// ex) 자동차의 최고속도를 저장하고싶으면 int carMaxSpeed; [카멜표기법 / 낙타등처럼 단어를 연결]
		// 자바 예약어는 사용할 수 없다 ex) class , void
	}
}
