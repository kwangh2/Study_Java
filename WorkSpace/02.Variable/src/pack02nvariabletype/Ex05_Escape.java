package pack02nvariabletype;

public class Ex05_Escape {
	public static void main(String[] args) {
		//Escape 문자는 왜쓸까
		//문자열 내부에 코테이션을 콘솔에 출력하려면
		String str_v = "\"자바\"를 좋아합니다 ";
			System.out.println(str_v);
		//출력을 할 수 없는 문자나 명령어를 통해서 문자열 정리 등의 기능이 가능한것.
		//tab 
		System.out.println("번호\t이름\t직업 혈액형");
		System.out.println("\\");
		System.out.println("D:\\folder\\..");
		System.out.print("프린트?");
		System.out.print("여름이었다");
		//println 의 ln은 line new (줄바꿈)
		System.out.print("프린트\n");
		System.out.println("여름이었다");
	}

}