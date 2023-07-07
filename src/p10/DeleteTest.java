package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		
		try {
			Connection con = DBCon.getCon();
			String sql = "DELETE FROM USER_INFO WHERE UI_NUM = 6";
			Statement stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행 갯수 : " + resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
