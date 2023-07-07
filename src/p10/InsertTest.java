package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertTest {
	
	public static void main(String[] args) {
		
		try {
			Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME)\r\n"
					+ "VALUES('TEST2', 'TEST2', '연습2')";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행 갯수 : " + resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
