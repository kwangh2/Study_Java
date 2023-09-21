package pack05.etc;

public class Ex03_Continue {
	public static void main(String[] args) {
		// & : 비트연산
		// 1 : 000 1 * 1 = 1
		// 2 : 001 0 * 1 = 0
		// 3 : 001 1 * 1 = 1
		// 4 : 010 0 * 1 = 0
		// 5 : 010 1 * 1 = 0
		// 홀수는 1 , 짝수는 0
		//System.out.println(-3%2);
		//break vs continue
		int oddsum = 0;
		for (int i = 1; i<=10; i++) {
			if((i&1)!=1) {
				continue;
			}
			oddsum +=i;
		}
		System.out.println(oddsum);
	}
}
