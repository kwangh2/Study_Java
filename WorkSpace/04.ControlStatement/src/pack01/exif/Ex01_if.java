package pack01.exif;

public class Ex01_if {
	public static void main(String[] args) {
		// main 메소드(함수,기능)
		// javaProject 에서 프로그램의 시작점을 구분하기 위한 메소드 ==>main
		// 지역 블럭킹이 열리면 메모리에 올라가고 , 블럭킹이 끝나면 메모리에서 내림을 반복한다.
		// if (조건식) {
		// if문 지역 : 조건식이 true 일때만 코드 실행
		// }
		int score = 100;
		if (score >= 90) {
			if (score == 100) {
				System.out.println("100점이면 장학금을 받음");
			}
			System.out.println("90점 이상이여서 장학금 받음 ");

		}
		System.out.println("무조건 실행됨");
	}// end MainMethod
}// Class
