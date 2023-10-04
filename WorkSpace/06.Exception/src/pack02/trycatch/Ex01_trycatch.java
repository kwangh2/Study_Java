package pack02.trycatch;

public class Ex01_trycatch {
	public static void main(String[] args) {
		String str = "10a";
		
		try {
			Double.parseDouble(str);			
		} catch(Exception e){
			System.out.println("오류발생");
			System.out.println(e.getMessage());//에러 알려줌
			e.printStackTrace();//원래 나오던 오류코드 출력
		}
		//		//예외가 발생할것같은 코드
		//try블럭 , catch블럭을 이용해서 개발자가 정한 방향으로 프로그램이 정상작동

		
	}
}
