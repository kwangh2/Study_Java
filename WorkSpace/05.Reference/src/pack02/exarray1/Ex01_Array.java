package pack02.exarray1;

public class Ex01_Array {
	public static void main(String[] args) {
//		int score1 = 1; 
//		int score2 = 2; 
//		int score3 = 3; 
//		int score4 = 4; 
//		int score5 = 5; 
		int[] intArr;
		//배열의 크기가 n이 주어졌을때 배열의 인덱스는 0~n-1 까지를 의미함 (4 -> 0~3)
		intArr = new int[4]; //stack[intArr, memoryNum] -> heap memoryNum : 0[] 1[] 2[] 3[]..
		System.out.println(intArr);//[I@3d012ddd <= 힙의 어드레스주소[우리한테 의미없는값]
		intArr[0] =1;
		intArr[1] =2;
		intArr[2] =3;
		intArr[3] =4;
		
		for(int i = 0; i<intArr.length; i++) {
		System.out.println(intArr[i]);}
		
		System.out.println("배열의 크기 : " + intArr.length);
	}
	}
