package Pack01.exstring;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "jkh";
		String str2 = "jkh";
		String str3 = sc.nextLine();
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		if (str1 == str2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		if(str1.equals(str3)) {//string은 값비교는 equals를 통해 가능
		System.out.println("값 같음");	
		}else {
			System.out.println("값 다름");
		}
	}
}
