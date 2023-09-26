package pack03.exarray2;

public class Ex04_Swap {
	public static void main(String[] args) {
//		int num1 = 10 , num2 = 20;
//		int num3 = num1; // 일시적으로 쓰는 변수는 보통 tempNum 사용
//		num1 = num2;
//		num2 = num3;
		//System.out.println(num1 + " : " + num2 );
		int[] arr = {3 , 5, 7, 9 , 1, 2, 4, 10};
		//int[] tempArr = new int[8];
		arr = new int[] {0, 3 , 5, 7, 9 , 1, 2, 4, 10, 0,0 ,0 };
		for (int i = 0; i < (arr.length-2); i++) {
			while(arr[i] < arr[i+1]) {
				arr[i] = arr[i+1];
				arr[i+1] = arr[i+2];
				System.out.print(arr[i] + "/ ");
			}
			
		}		
	}
}
