
public class Ex04_Bool {
	public static void main(String[] args) {
		//true 와 false만 저장이 가능한 변수 타입 : boolean
		boolean BoolT = true;
		boolean BoolF = false;
		// true=1, false=2
		//AND 연산자 = 논리곱 : N개의 조건이 있다면 모든 조건이 true 일떄 만 true
		// 1 * 1 * 1 * .... 0 = false
		// OR 연산자
		//논리합 : n개의 조건 중 하나라도 true 가 있다면 true
		// 1 + 1 + 1 + .... +0 = true
		
		// ! <= not
		// 어떤 true , false 앞에 붙이면 해당 결과를 반전시킴 (! = -)
		System.out.println(!BoolF);
	}
}
