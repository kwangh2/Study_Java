package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn;
	
	public void closeConnection() { // 통신닫기 
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean isConnection() {
		//url , user, password => Properties 파일 ( 접속정보가 파일로 저장되어있는것) Stream 으로 파일 읽어오기.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("열림");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void memberDisPlay(ArrayList<MemberDTO> list) {
		if(list == null || list.size() ==0) {
			System.out.println("데이터없음 ");
			return;
		}
		for(MemberDTO dto : list) {
			System.out.println("ID : " + dto.getId() + " PW : " + dto.getPw());
		}
		
	}
	
	public ArrayList<MemberDTO> selectMember() {
		ArrayList<MemberDTO> list = new ArrayList<>();
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("select * from member");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("pw"));
					list.add(dto);
//					System.out.println(rs.getString("id") + " " + rs.getString("pw"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
		}
		return list;
	}
	
	public void insertMember(MemberDTO dto) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("insert into member values ( ? , ?)");
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				int result = ps.executeUpdate();
				System.out.println(conn.getAutoCommit());
//				conn.commit();//※ 확정되지 않은 작업이 있는 테이블 조회 시 연결 실패뜸. DB LOCK ※
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
		}
	}
	
	public void updateMember(MemberDTO dto) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("update member set pw = ? where id= ?");
				ps.setString(1, dto.getPw());
				ps.setString(2, dto.getId());
				int result = ps.executeUpdate();// 0 이나 -1은 실패 
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
		}
	}
	
	public void delete(MemberDTO dto) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("delete from member where id= ?  and pw = ?");
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
		}
		
	}

	public boolean isMember(String id) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("select count(*) from member where member.id = ?");
				ResultSet rs = ps.executeQuery();
				rs.next();
				System.out.println(rs);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
		}return false;
	}
}
