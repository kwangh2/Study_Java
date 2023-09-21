package pack04.exwhile;

public class Ex01_While {
	public static void main(String[] args) {
//		int i = 0;
//		while(i<10) {
//			System.out.println("while1");
//			i++;
//		}
//		i = 0 ; // <=제어 변수가 제어문 외부에 있을대 단점
//		while(i<10) {
//			System.out.println("while2");
//		}
		int i = 0;
		int sum = 0;
		while (i<=10) {
			sum = sum + i;
			i++;
		}System.out.println(sum);
	}
}
