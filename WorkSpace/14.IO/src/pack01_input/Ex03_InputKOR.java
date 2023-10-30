package pack01_input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03_InputKOR {
	public static void main(String[] args) {
		//InputStreaml : 바이트 데이터  : Acrii;
		//InputStreamReader  :문제 데이터를 입력받는스타
		
		//영어 한글 byte 사용 범위가 다름 : 문자열 기반의 스트림 종류는 바이트를 넒게 잡아 한글 데이터씪 끊어오는게 가능함
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			int data = isr.read();
			System.out.println(data);
			System.out.println((char)data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
