package pack01.method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TestcaseDAO {
	//@Test를 하겠다 . (어노테이션)
//	@Timeout - 응답 시간, 메소드를 호출하고 결과를 받기까지의 시간. (웹 디비에 접속 후 데이터를 받아오기까지 위한 시간)
	// 잘못된 부부만 확인하기 때문에 디버깅속도가 빨라짐.
	//메소드에 불필요한 변수들이 많이 파라메터로 지정되어있다면 테스트 자체가 불편함 -> ※"코드 리팩토링"※
	//다른 개발자가 나의 클래스 메소드 등을 이용할 때 부분만 확인하고 자신의 문제점도 빠르게 파악이 가능
	//통합테스트 : 모든 개발자의 코드를 병합하여 배포 "전" 테스트서버 또는 운영서버에서 테스트함.
	
	// Given , Should , When , Then 의 규칙으로 작성.
	// Given : 테스트에 사용된 자원을 준비하는 과정 (인스턴스화) DAO dao = new DAO();
	//Should : 조건이나 When 비교에 가기 전 과정이 필요 (생략 가능)
	//When : 실행(비교)
	//Then : 검증( 원하는 결과값을 얻었는지, 오류여부)
	@DisplayName("DAO의 Sum메소드")
	@Test
	void testSum() {
		DAO dao = new DAO();
		int result = dao.number1(6, 4);
		
		assertEquals(result, 10);
		//then : 검증오류
		
		
	}
	
	
	
}
