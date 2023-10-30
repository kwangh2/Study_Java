package pack01_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex05_Buffer {
	public static void main(String[] args) throws IOException {
		//여러글자 출력 BufferReader (권장)
		//BufferReader vs InputStreamReader
		// 실제 처리를 Ins(Scanner)는 한글자씩(Byte , int)
		//입력한 글자수만큼 접근이 이루어짐 -> 메모리 소모 ↑ , 속도저하, 버그 등 
		//이러한 비효율성을 개선해서 여러글자를 입력하더라도 , Buffer라는 공간에 입력을 해놓고
		// 한번에 출력할수 있는 처리를 지원 -> BufferReader
		//BufferReader 는 1024 바이트를 한번에 처리가 가능하다.
		//BufferReader > InputStreamReader > Input Stream (노드 스트림)
		//InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		System.out.println(data);
		br.close();
		
	}
}
