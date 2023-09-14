package pack03.typechange;

public class Ex03_CastingString {
	public static void main(String[] args) {
		// String 변수 str1 , str2를 각각 10과 20의 값을 담아 초기화 시키고
		// 합을 출력
		String str1 = "10";
		String str2 = "20";
		System.out.println(str1 + str2);
		int intV1 = 10;
		int intV2 = 20;
		System.out.println(intV1 + intV2);
		// String의 연산 법칙 : Concatenation (연결)
		// String의 +는 문자열의 연결을 의미하며
		// 어떤 변수를 String에 더해도 그 변수의 타입은 자동으로 String이 된다.
		// 따로 연산이 필요한 식이 있다면 소괄호 처리를 해주면된다
		// 숫자->String : + String 해주면 끝
		// WrapperClass(포장):String을 WrapperClass로 감싸주면 해당 타입으로 변한다.
		// double -> Double, byte->Byte...
		// ※int->Integer※
		// parse
		// int number1 = str1; - mismatch
		int number1 = Integer.parseInt(str1); // "10" -> 코테이션 제거

		// int number2 = Integer.parseInt("10A") - NumberFormatException
		// String에 있는값이 숫자로 바뀌기에 부적합한 경우 나오는 오류
		// input string : "글자"

		String numberString = 10 + "";
		System.out.println(numberString + 10);
		
		

	}
}
