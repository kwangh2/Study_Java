package pack01.exif;

public class Test01_If {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("num의 값은" + num + "입니다.");
		if (num % 2 == 1) {
			System.out.println("num은 홀수입니다");
		}
		if (num % 2 != 1) {
			System.out.println("num은 짝수입니다");
		}

	}
}
