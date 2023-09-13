package pack01.variable;

public class Ex05_VariableLocal {
	public static void main(String[] args) {
		int num = 10;
		{int num1 = 12;
		num = num1 + 5;
		}
	System.out.println(num);
	}
}
