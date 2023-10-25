package pack01.method;

public class DAO {
	public int number1(int x, int y) {
		return x+y;
	}
	public String word(String str) {
		return str;
	}
	public boolean trueFalse() {
		return true;
	}
	public double doubleNum(double db) {
		return db;
	}
	public void display(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}
