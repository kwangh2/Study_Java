package pack01_input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.crypto.Data;

public class Ex04_InputKORMulti {
	public static void main(String[] args) throws IOException {
		Ex04_InputKORMulti kor = new Ex04_InputKORMulti();
		String data = kor.jkhScanner();
		System.out.println(data);
	}
	public String jkhScanner() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		int iData;
		String data ="";
		while((iData = isr.read() ) != -1) {
			if(iData == 13 || iData ==10) {
				break;
			}
			data +=(char)iData+"";
			
		}
		
		return data;
	}
	
}
