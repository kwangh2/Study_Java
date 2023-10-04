package exam.array;

import java.util.Arrays;

public class Ex02_Array {
	public static void main(String[] args) {
		int[] array = { 4,5,2,1,3,7,10,6,8,9};
		for (int i = 0; i<array.length; i++) {
//			System.out.println(array[i]);
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int tempInt ;
					tempInt = array[i];
					array[i] = array[j];
					array[j] = tempInt;
				}
			}
		}System.out.println(Arrays.toString(array));
	}
}
