package pack01.method;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.plus(1, 2);
		cal.minus(2, 1);
		System.out.println(cal.div(18, 2));
		System.out.println(cal.mul(3, 6));
	}
}
