package pack03.exfor;

public class Ex03_ForFor {
	public static void main(String[] args) {
		//for문이 3개 이상 사용 될 때는 코드 이상을 꼭 의심하자
//		for (int i= 1; i<10; i++) {
//			for (int j = 2 ; j < 10; j++) {
//				
//				System.out.print(j + "*"+ i + "=" + (i*j) + "\t");
//				
//			}System.out.println("");
//		}
		for (int i = 1 ; i<=5; i++) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print("★");
			}
			System.out.println();}
		for(int  i = 5 ; i>=1; i--) {
			for (int j = 1; j<=i; j++) {
				System.out.print("★");
			}System.out.println();
		}
	} 
}
