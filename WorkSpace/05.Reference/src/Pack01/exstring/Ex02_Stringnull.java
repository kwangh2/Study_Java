package Pack01.exstring;

import java.util.Scanner;

public class Ex02_Stringnull {
	public static void main(String[] args) {
		//기본형 데이터타입은 stack 메모리에 저장 참조형은 heap메모리 저장
		//참조형 데이터는 임의 번지수에 저장되어 임의값을 지정받으므로 비교형 연산 불가능
		//String str1 = null; // 참조형 데이터타입이 stack에 참조를 시작하지않음을 표시함
		//객체(Object) : 참조형 데이터타입은 모두 참조를 시작해야만, 내부에 있는 기능이나 값을 이용할수가있다.
//		Scanner sc = null;
//		if (sc != null) {
//			sc.nextLine();
//		}
		//모든 객체는 new라는 키워드(문장)을 통해서 heap에 새로운 영역을 만들고 참조를 시작함.
		String str1 = new String("A");
		String str2 = new String("A");//new에서 새로운 참조를 시작
		if (str1 == str2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
	}
}
