package pack03.typechange;

public class Ex02_Casting {
	public static void main(String[] args) {
		//0.아래의 명령은 무슨 캐스팅인가 - UpCasting
		//1.아래의 명령은 몇 번의 캐스팅이 발생했는가? 
			//1.1: 3.5F + 12.0F = int -> Float
			//1.2: 15.5F = float -> double
			//줄에 있는 전체 타입 갯(N-1)
		double sum = 3.5F + 12;
		
		//2진수로는 소수점을 정확하게 표현못함. 근사치를 계속해서 계산.
		//데이터의 정확한 계산은 -> Database
		double sum2 = 3.14F + 12;
		System.out.println(sum2);
		
	}
}
