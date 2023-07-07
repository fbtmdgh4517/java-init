package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("회원번호 : ");
		int uiNum = Integer.parseInt(scan.nextLine());
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PWD : ");
		String uiPwd = scan.nextLine();
		System.out.print("NAME : ");
		String uiName = scan.nextLine();
		
		try {
			Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();
			String selectSql = "SELECT * FROM user_info WHERE UI_ID = '" + uiId + "' " + 
			"and UI_NUM != " + uiNum;
			ResultSet rs = stmt.executeQuery(selectSql);
			if(rs.next()) {
				System.out.println("이미 존재하는 아이디 입니다.");
			} else {
				String sql = "UPDATE user_info SET UI_ID = '" + uiId + 
						"', UI_PWD = '" + uiPwd + 
						"', UI_NAME = '" + uiName + 
						"' WHERE UI_NUM = '" + uiNum + "'";
				int resultCnt = stmt.executeUpdate(sql);
				System.out.println("정보 수정");
				System.out.println("반영된 행의 개수 : " + resultCnt);				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
