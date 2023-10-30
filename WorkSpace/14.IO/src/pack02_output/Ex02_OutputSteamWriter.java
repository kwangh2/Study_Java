package pack02_output;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex02_OutputSteamWriter {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		osw.write("문자열 출력 \n 줄바꿈 \n");
		osw.flush();
	}
}
