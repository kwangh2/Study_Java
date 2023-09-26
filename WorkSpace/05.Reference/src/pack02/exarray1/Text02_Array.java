package pack02.exarray1;

public class Text02_Array {
	public static void main(String[] args) {
		int[] intArr = new int[9];
		//2 x i = 2*i
		for (int i=0 ; i<intArr.length; i++) {
			intArr[i] = i+1;
		
			System.out.println("2 x " + (intArr[i]) + "=" + (2*(intArr[i])));
		}System.out.println("break");
	}
}
