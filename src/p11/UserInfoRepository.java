package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class UserInfoRepository {

	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		List<Map<String, String>> userInfoList = new ArrayList<>();
		Connection con = DBCon.getCon();	// statement는 연결된 애로 만들어서 con으로 만드는거임
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM user_info";
			if(param != null) {
				if(param.get("uiName") != null) {
					sql += " WHERE UI_NAME LIKE '%" + param.get("uiName") + "%'";					
				}
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> userInfo = new HashMap<>();
				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfo.put("uiName", rs.getString("UI_NAME"));
				userInfoList.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userInfoList;
	}
	
	public int insertUserInfo(Map<String, String> userInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME) VALUES ('" 
			+ userInfo.get("uiId") + "', '" + userInfo.get("uiPwd") + "', '" + userInfo.get("uiName") + "')";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int deleteUserInfo(Map<String, String> userInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM user_info WHERE UI_ID = '" + userInfo.get("uiId") + "'";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}
