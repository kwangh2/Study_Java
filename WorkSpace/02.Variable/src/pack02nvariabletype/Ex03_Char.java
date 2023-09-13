package pack02nvariabletype;

public class Ex03_Char {
	public static void main(String[] args) {
		char char_1 = 'A';
		char char_2 = '가';
		char char_3 = '★';
		
		System.out.println(char_1);
		System.out.println(char_2);
		System.out.println(char_3);
		
		char char_4 = 65;
		System.out.println(char_4);
		//char 문자를 숫자로 변환하거나 숫자를 문자로 변환하는 등의 용도로 사용함.
		// 따라서 문자를 담는 용도가 아니라 숫자를 담아야 할때는 short, int, long 사용
		char char_5 = '\u0041'; //안드로이드 특수문자가 막혀있을때 => '\u0041'
		System.out.println(char_5);
		//String은 기본형 데이터 타입이 아님
		//첫글자가 대문자로 시작한다.
		String string_v1 = "장광희";
		System.out.println(string_v1);
	}
}
