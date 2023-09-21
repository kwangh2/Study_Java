package pack04.exwhile;

public class Test02_while {
	public static void main(String[] args) {
//		for (int i = 2; i<10 ; i ++) {
//			int j = 1;
//			while(j<10) {
//				System.out.println(i + " x " + j + " = " + (i*j));
//				j++;
//			}
//		}
		int i = 2;
		while (i<10) {
			for (int j = 1 ; j < 10 ; j++) {
				System.out.println(i*j);
			}
			i++;
		}
	}
}
