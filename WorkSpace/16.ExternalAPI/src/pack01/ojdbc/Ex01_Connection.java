package pack01.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Connection {
	public static void main(String[] args) {
		try {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

			Scanner sc = new Scanner(System.in);
			System.out.println("id입력(member)");
			String id = sc.nextLine();
			System.out.println("pw입력(member)");
			String pw = sc.nextLine();

			String sql = "SELECT ID, PW FROM MEMBER WHERE ID = '"+ id + "' and PW='" + pw + "'";

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hanul";
			String password = "0000";
			Connection conn = DriverManager.getConnection(url, user, password);

			PreparedStatement ps = conn.prepareStatement(sql);
//		ps.setString(1, id);
//		ps.setString(2, pw);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("id"));
			}
			if (!conn.isClosed()) {
				System.out.println("핑 성공!");
			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
