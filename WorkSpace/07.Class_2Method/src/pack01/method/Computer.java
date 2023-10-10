package pack01.method;

public class Computer {
	boolean isPower;
	
	public void plus(int a, int b) {
		if (isPower == false) {
			System.out.println("컴퓨터의 전원을 켜주세요");
		}else {
			System.out.println(a+b);
		}
	}
}
