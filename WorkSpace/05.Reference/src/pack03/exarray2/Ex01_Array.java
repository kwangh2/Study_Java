package pack03.exarray2;

public class Ex01_Array {
	public static void main(String[] args) {
		int[][] arr = new int[2][4];
		System.out.println("2차원 배열의 크기 : " + arr.length);
		System.out.println("2차원 배열이 가지고있는 1차원 배열의 크기 : " + arr[0].length);
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		
		for (int i = 0; i < arr.length ; i++) {
			
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
				
			}System.out.println();
		}
	}
}
