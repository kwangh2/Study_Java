package pack04.exwhile;

public class Test01_while {
	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		while(i<10) {
//			System.out.println("2 x " + i + "=" + (2*i));
			while(j<10) {
				System.out.println(i + " x " + j + " = " + (i*j));
				j++;
				
			}i++;
			j = 1 ;
			
		}
		
	}
}
