package exam.operator;

public class Ex01 {
	public static void main(String[] args) {
		int num1=2 , num2=4;
		//변수는 대입 연산자 또는 증감식을 제외하고 내용이 절대 안바뀜.
		System.out.println("num1과 num2의 더하기 결과 : " + (num1 + num2));
		System.out.println("num1과 num2의 빼기 결과 : " + (num1 - num2));
		System.out.println("num1과 num2의 곱하기 결과 : " + (num1 * num2));
		System.out.println("num1과 num2의 나누기 결과 : " + (num1 / num2));
		System.out.println("num1과 num2의 나눈후 나머지 결과 : " + (num1 % num2));		
		
		num1 = -1 * num1; //가독성 좋음
		System.out.println(num1);
		num1 = -num1;
		System.out.println(num1);
		
		num1++;
		System.out.println(num1);
		num2--;
		System.out.println(num2);
		
		// == 같다, != 다르다
		boolean num3 = num1>num2;
		boolean num4 = num1<num2;
		boolean num5 = num1==num2;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println("문제" + (num1 == num2));
		
		boolean num6 = num1 > num2 || num1 < num2;
		System.out.println(num6) ;
		num1 +=1;
		num1 +=1;
		System.out.println(num1);
		
		String num7 = num1 > 2 ? "num1은 2보다 크다" : "num1은 2이하다";
		System.out.println(num7);
	}
}
