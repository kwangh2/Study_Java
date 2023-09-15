
public class Ex06_Oper {
	public static void main(String[] args) {
		// = : 대입, 값 할당 , 대입 연잔사 기준으로 우측에 잇는 값을 좌변에 할당
		// 비교 연산자 ( == , < , > , <= , >= )
		// 1, 2, 3
		// 0, 1, 2, 3, 4
		//같다 - == / 다르다 - !=
		boolean booleanV1 = 1 < 3 && 1 < 4; // 1*1 = 1 (true)
		boolean booleanV2 = 501 < 3 || 51 > 3 ; // 1 + 0 = 1 (true)
		boolean booleanV3 = 519 == 510; //false
		boolean booleanV4 = 519 != 510; // true
		boolean booleanV5 = 519 <= 510; // false
		boolean booleanV6 = 519 >= 510; // true
		System.out.println(booleanV1);
		System.out.println(booleanV2);
		System.out.println(booleanV3);
		System.out.println(booleanV4);
		System.out.println(booleanV5);
		System.out.println(booleanV6);
		// AND : && , OR : ||
		// 조건식 뒤에 AND, OR 연산자가 붙으면 조건식이 연결된다.
		// 비교 연산 후에는 반드시 bool형 데이터 true, false가 나옴
		
	}
}
