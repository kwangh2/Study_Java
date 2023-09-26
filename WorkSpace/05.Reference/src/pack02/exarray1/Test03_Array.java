package pack02.exarray1;

public class Test03_Array {
	public static void main(String[] args) {
		String[] strArr = new String[5];
//		for (int i = 0 ; i<5; i++) {
//			for(int j = 0 ; j <= i ; j++) {
//			strArr[i] = "★";
//			System.out.print(strArr[i]);
//			}System.out.println();
		for (int i = 0 ; i < strArr.length; i++) {
			if(i == 0 ) {
				strArr[i] = "★";
			}else {
				strArr[i] = strArr[i-1] + "★";
			}System.out.println(strArr[i]);
		}
		System.out.println();
	}
}
