
public class practice {
	public static void main(String[] args) {
		int num1 = 7, num2 = 7;
		int result1, result2;
		
		result1 = --num1 + 4;
		result2 = num2-- + 4;
		
		System.out.println("전위 감소 연산자에 의한 결과 : "+ result1 + ", 변수의 값 : " + num1);
		System.out.println("후위 감소 연산자에 의한 결과 : "+ result2 + ", 변수의 값 : " + num2);	
		
		int x = 10;

		int y = x-- + 5 + --x;

	}
	
}
