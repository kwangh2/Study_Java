package pack03.exarray2;

public class Test01_Array {
	public static void main(String[] args) {
		int[][] arr = new int[8][9];
		for(int i = 0; i < (arr.length) ; i++) {
			for (int j = 0; j < (arr[0].length) ; j++) {
				arr[i][j] = (i+2)*(j+1);
				System.out.println((i+2) + "*" + (j+1) + " = " + arr[i][j]);
			}
	}System.out.println(arr);
}
}