package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");		// jdbc 라이브러리가 한개가 아니면 꼭 써줘야됨
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		try {
			Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "UPDATE user_info SET UI_NAME = '이름3', UI_PWD = 'PWD3' WHERE UI_NUM = 7";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행의 개수 : " + resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
