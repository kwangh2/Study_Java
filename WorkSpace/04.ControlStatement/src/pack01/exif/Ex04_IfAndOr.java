package pack01.exif;

public class Ex04_IfAndOr {
	public static void main(String[] args) {
		//조건식 : 반드시 true, false 를 반환받는식
		//boolean 에 담을 수 있는 값.(==조건식)
		int score = 75;
//		boolean isCheckUp90 = score >= 90;// true , false
//		boolean isCheckUp80 = score >= 80;// true , false
//		
//		if (isCheckUp90) {
//			System.out.println("A");
//		}else if(isCheckUp80) {
//			System.out.println("B");
//		}else {
//			System.out.println("not A or B");
//		}
//		
		int number = 10;
//		if (number % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//		System.out.println("이며");
//		if (number % 3 == 0) {
//			System.out.println("3의 배수임");
//		}
//		else {
//			System.out.println("3의 배수가 아님");
//		}
		
		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("짝수이며, 3의 배수이다");
		}else if (number % 2 != 0 && number % 3 == 0) {
			System.out.println("홀수이며, 3의 배수이다");
		}else if (number % 2 == 0 && number % 3 != 0) {
			System.out.println("짝수이며, 3의 배수가 아니다");
		}else {
			System.out.println("홀수이며, 3의배수가 아니다 ");
		}
		
		String result = number % 3 == 0 ? "3의 배수" : "3의 배수x";
		if(number%2==0) { 
			System.out.println("2의 배수," + result);
		}	else {
			System.out.println("2의배수 x," + result);
		}
		if (number%2 == 0) {
			if(number%3 == 0) {
				System.out.println("짝수이며, 3의 배수다");
			}else {
				System.out.println("짝수이며 3의 배수가 아니다 ");
			}
		}else {
			if(number%3==0) {
				System.out.println("홀수이며, 3의배수이다");
			}else {
				System.out.println("홀수이며, 3의 배수가 아니다 ");
			}
		}
	}
}
