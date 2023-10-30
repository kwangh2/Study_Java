package pack03_fileio;

import java.io.File;

public class Writer {
	public static void main(String[] args) {
	File directory = new File("Ex02_FileWriter");
	if(directory.isFile()) {
		directory.createNewFile();
	}
	}
	
}	
