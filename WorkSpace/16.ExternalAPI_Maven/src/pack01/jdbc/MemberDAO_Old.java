package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO_Old {
	private Connection conn;
	
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
	
	
	public void selectMember() {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("select * from member");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("id") + " " + rs.getString("pw"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertMember(String id, String pw) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("insert into member values ( ? , ?)");
				ps.setString(1, id);
				ps.setString(2, pw);
				int result = ps.executeUpdate();
				System.out.println(conn.getAutoCommit());
//				conn.commit();//※ 확정되지 않은 작업이 있는 테이블 조회 시 연결 실패뜸. DB LOCK ※
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateMember(String pw, String id) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("update member set pw = ? where id= ?");
				ps.setString(1, pw);
				ps.setString(2, id);
				int result = ps.executeUpdate();// 0 이나 -1은 실패 
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
