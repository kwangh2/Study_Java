package pack03.typechange;

public class Ex04_CastingFinich {
	public static void main(String[] args) {
		String str_v1 = "3.14";
		String str_v2 = "100";
		double number1 = Double.parseDouble(str_v1);
		int number2 = Integer.parseInt(str_v2);
		System.out.println(number1+1);
		System.out.println(number2+100);
		double number3 = number1 + 1;
		System.out.println("--"+ number3);
		int number4 = number2 +100;
		int intNumber1 = (int) number3; //DownCasting
		System.out.println(intNumber1);
		
		short shortNumber1 = (short) number4;
		System.out.println(shortNumber1); //DownCasting
	}
}
