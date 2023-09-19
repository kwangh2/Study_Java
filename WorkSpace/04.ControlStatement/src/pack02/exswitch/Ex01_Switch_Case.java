package pack02.exswitch;

public class Ex01_Switch_Case {
	public static void main(String[] args) {
		//사용빈도가 상대적으로 if문 보다는 낮기 때문에 더 중요한 것은 if문
		// 선택문 (switch - case)
		//다중 if문 (if else-if)를 간략하게표현
		//값을 기준으로만 판단이 가능함. (복잡한 조건에는 사용이 까다롭다) <=제한사항 / 실무사용 낮음
		//정해진 메뉴가 숫자 또는 정확한 문자로 되어있는경우 가끔 사용
		//switch (기준값 ) != if (조건식)
		//case 값 : 
		// 값이 case 값과 같은 경우 실행
		// break; <= 종료시킴.
		int number = 10;
		switch (number%2) {
		case 0:
			if(number%3 == 0) {
				System.out.println("");
			}
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
	}
}
