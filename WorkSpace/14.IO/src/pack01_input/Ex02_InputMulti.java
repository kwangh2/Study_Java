package pack01_input;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputMulti {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		// ABC를 콘솔에 입력함. ABC전체가 출력되게 ㅎㅏ려면 어떻게 해야할

//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
		// 개수를 정확히 모르는 경우 => while
		int data; // is.read(); <=데이터를 담기 위한변수 0~255
		while ((data = is.read()) != 1) {
System.out.println("입력하신 문자 int : " + data);
System.out.println("char" + (char)data);
		}
		System.out.println("프로그램 종료");
	}
}
