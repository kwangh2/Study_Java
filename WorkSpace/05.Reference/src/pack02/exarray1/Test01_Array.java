package pack02.exarray1;

import java.lang.reflect.Array;

public class Test01_Array {
	public static void main(String[] args) {
		int[] intArr = new int[10];
		double sum =0;
		for (int i = 0; i<intArr.length; i++) {
			intArr[i] = i;
			System.out.println(intArr[i]);
			sum += intArr[i];
			
		}System.out.println(sum/intArr.length);
	}
}
