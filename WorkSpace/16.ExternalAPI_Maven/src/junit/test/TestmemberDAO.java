package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pack01.jdbc.MemberDAO;
import pack01.jdbc.MemberDTO;

class TestmemberDAO {
	
	
	@DisplayName("연결 테스트")
	@Test
	void connTest() {
		MemberDAO dao = new MemberDAO();
//		dao.checkConnection();
		assertTrue(dao.isConnection());
	}
	
	@DisplayName("멤버테이블 조회")
	@Test
	void selectMember() {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectMember();
		dao.selectMember();
		assertTrue(list.size() != 0);
	}
	
	@DisplayName("등록 멤버 인서트")
	@Test
	void insertMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("sdfsdf", "qeqwe");
		dao.insertMember(dto);
//		dao.insertMember("king" ,"queen" ); => dto 받아오게 수정
	}
	
	@DisplayName("회원 정보 수정 ")
	@Test
	void updateMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("sdfsdf", "qeqwe");
		dao.updateMember(dto);
//		dao.updateMember("sdf", "qwer"); -> dto 받아오게 수정 
	}
	
	@DisplayName("멤버 테이블 콘솔 출력 ")
	@Test
	void display() {
		MemberDAO dao = new MemberDAO();
//		dao.memberDisPlay(null);
		ArrayList<MemberDTO> list = dao.selectMember();
		dao.memberDisPlay(list);
	}
	
	@DisplayName("회원정보 삭제 ")
	@Test
	void delete() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("ASDFASDF", "QWERQWER");
		dao.delete(dto);
	}
	
	@DisplayName("중복 확인")
	@Test
	void isMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("", "");
		dao.isMember(dto);
	}

}

