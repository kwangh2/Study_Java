package pack03.exfor;

public class Test01_For {
	public static void main(String[] args) {
//		int i = 0;
//		i = i+1;
//		i = i+2;
//		i = i+3;
//		i = i+4;
//		i = i+5;
//		i = i+6;
//		i = i+7;
//		i = i+8;
//		i = i+9;
//		int sumI = 0;
//		for (int i = 0 ; i<10 ; i++) {
//			sumI = i + sumI;
//		}
//		System.out.println(sumI);
		int i = 0;
		int sumI = 0;
		int sumI2 = 0;
		for (i = 0 ; i<10 ; i ++) {
			if(i%2 == 1) {
				 sumI = i + sumI;
				System.out.println(sumI);
			}else {
				sumI2 = i + sumI2;
			}
		}
		System.out.println(sumI2 + "짝수 합");
		
	}
}
