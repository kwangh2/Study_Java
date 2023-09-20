package pack03.exfor;

public class Ex02_For {
	public static void main(String[] args) {
		for (int i = 1 ; i <= 20 ; i++) {
			//if (i%2 == 0) {
			//	System.out.println(i +"짝수");
			//}else {
			//	System.out.println(i + "홀수");
			//}
			switch (i % 2) {
			case 0 : 
				System.out.println(i + "짝수");
				break;
			default : 
				System.out.println(i + "홀수");
				break;
			} 
		}
	}
}
