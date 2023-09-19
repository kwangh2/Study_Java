package pack01.exif;

public class Test03_If {
	public static void main(String[] args) {
		char bloodType = 'O';
		if (bloodType == 'A') {
			System.out.println("A형");
		}else if(bloodType == 'B') {
			System.out.println("B형");
		}else if(bloodType == 'O' ) {
			System.out.println("O형");
		}else {
			System.out.println("잘못된 입력");
		}
	}
}
