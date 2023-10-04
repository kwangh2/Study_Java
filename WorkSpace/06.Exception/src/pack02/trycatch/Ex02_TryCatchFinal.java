package pack02.trycatch;

public class Ex02_TryCatchFinal {
	public static void main(String[] args) {
		try {
			System.out.println("1.물조절");
			System.out.println("2.가스불ON");
			System.out.println("3.가스불OFF");
			System.out.println("4.종료");
		} catch (Exception e) {
			System.out.println("예외발생(물넘침)");
			System.out.println("가스불 OFF");
			System.out.println("종료");
		}finally {
			//무조건 실행되는 코드
			System.out.println("3. 가스불 OFF");
			System.out.println("종료");
		}
	}
}
