
public class Ex08_Oper {
	public static void main(String[] args) {
		//복합대입연산자. ( 대입 ) =<- 어떤 변수에 값을 할당할떄 사용함
		int result = 0;
		result = result + 10 ; // 변수에는 0 + 10 의 결과가 할당
		result +=10 ;
		System.out.println(result); // result(0) -> 0+10 -> 10 + 10
		result -=5;
		System.out.println(result);
		result *=3; // result * 3 
		result /=5; // result / 5
		result %=2; // result % 2
		
	}
}
