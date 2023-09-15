
public class Ex07_Oper {
	public static void main(String[] args) {
		//삼항 연산자 : 4장에서 배우는 조건문을 많이 이용해 (if)
		//조건식을 연산하여 true가 나올떄, false가 나올떄의 결과를 어떤 값으로 받고싶음.
		//  ex) 1과 2를 비교 후 참이 나오면 "참입니다" , 거짓(false)이면 "참이 아닙니다"
		// 조건식(비교연산자) ? "참" : "거짓"
		int intNum1 = 10;
		String result = intNum1 == 10 ? "참" : "거짓";
			System.out.println(result);
		int score = 70; // A~F등급
		String grade = score > 90 ? "A" : score > 80 ? "B" : score > 70 ? "C" : "E";
		System.out.println(grade);
	}
}
