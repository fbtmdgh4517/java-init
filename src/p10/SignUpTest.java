package p10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SignUpTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();
		System.out.print("NAME : ");
		String uiName = scan.nextLine();

		try {
			Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME) " + "VALUES ('" + uiId + "', '" + uiPwd + "', '" + uiName + "')";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("가입");
			System.out.println("반영된 행의 개수 : " + resultCnt);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
