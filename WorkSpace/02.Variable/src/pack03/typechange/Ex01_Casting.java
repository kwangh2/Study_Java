package pack03.typechange;

public class Ex01_Casting {
	public static void main(String[] args) {
		//변수는 값의 허용범위 용도등에 따라 여러 타입이 있다.
		//이런 변수의 타입을 용도에 따라서 바꿀수 있는데 이것을 우리는 타입변환이라고 한다
		//타입변화은 크게 두가지가있음.
		//1. 자동 타입 변환(묵시적 형변환, Upcasting)
		//작은 타입이(byte) 큰 타입(int)로 자동으로 변환 되는 것을 의미
		// 뭔가 따로 코딩을 안해도 되기때문에 묵시적이라는 표현도 사용함.
		//변수 허용범위 크기 byte<short<int<long<float<double
		byte byte_v = 127;
		short short_v = byte_v;
		int int_v = short_v;
		long long_v = int_v;
		//----자동 형변환 끝-----------------
		
		//2. 강제 type변환(명시적 형변환, DownCasting)
		//큰 타입(int)가 작은 타입(short,byte)으로 바꿔줘야할때 하는 형병환을 의미함.
		// 뭔가 따로 코딩을 해줘야하고 작은 타입의 명시가 한번 꼭 들어감 --> 명시적 형변환
		
		long long_v2 = 100;
		int int_v2 = (int) long_v2; //강제 형변환. 담으려는 작은 데이터 타입을 소괄호로 표현해줌
		System.out.println(long_v2);
		System.out.println(int_v2);
		
		double double_v2 = 3.14;
		int_v2 = (int) double_v2;
		System.out.println(double_v2);
		System.out.println(int_v2);
		
	}
}
