package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();
		
		try {
			Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM user_info WHERE UI_ID = '" + uiId + "' and UI_PWD = '" + uiPwd + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				String username = rs.getString("UI_NAME");
				System.out.println(username + " 로그인 됨");
			} else {
				System.out.println("로그인 안됨");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
