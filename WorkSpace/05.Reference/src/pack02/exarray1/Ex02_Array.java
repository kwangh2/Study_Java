package pack02.exarray1;

public class Ex02_Array {
	public static void main(String[] args) {
		String[] sArr = new String[10];
//		sArr[0] = "이름1";
//		sArr[1] = "이름2";
//		sArr[2] = "이름3";
//		sArr[3] = "이름4";
//		sArr[4] = "이름5";
//		sArr[5] = "이름6";
//		sArr[6] = "이름7";
//		sArr[7] = "이름8";
//		sArr[8] = "이름9";
//		sArr[9] = "이름10";
		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = "이름" + (i+1);
			System.out.println(sArr[i]);
		}
		//int[] intArr = {1,2,3};
		String[] strArr = {"abc", "bcd", "cde"};
		System.out.println(strArr[1]);
	}
}
