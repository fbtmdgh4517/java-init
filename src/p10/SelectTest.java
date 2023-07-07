package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		
		try {
			Connection con = DBCon.getCon();
			String sql = "SELECT * FROM user_info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String uiId = rs.getString("UI_ID");
				String uiPwd = rs.getString("UI_PWD");
				String uiName = rs.getString("UI_NAME");
				int uiNum = rs.getInt("UI_NUM");
				System.out.print("uiId : " + uiId + ", ");
				System.out.print("uiPwn : " + uiPwd + ", ");
				System.out.print("uiName : " + uiName + ", ");
				System.out.println("uiNum : " + uiNum);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
