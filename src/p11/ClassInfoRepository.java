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

public class ClassInfoRepository {
	
	public List<Map<String, String>> getClassInfos(Map<String, String> param) {
		List<Map<String, String>> classInfos = new ArrayList<>();
		
		Connection con = DBCon.getCon();
		
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM class_info";
			if(param != null) {
				if(param.get("ciName") != null ) {
					sql += " WHERE CI_NAME LIKE '%" + param.get("ciName") + "%'";					
				}
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> classInfo = new HashMap<>();
				classInfo.put("ciNum", rs.getString("CI_NUM"));
				classInfo.put("ciName", rs.getString("CI_NAME"));
				classInfo.put("ciDesc", rs.getString("CI_DESC"));
				classInfos.add(classInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return classInfos;
	}
	
	public int insertClassInfos(Map<String, String> param) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO class_info(CI_NAME, CI_DESC) VALUES ('"
					+ param.get("ciName") + "', '" + param.get("ciDesc") + "')";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteClassInfos(Map<String, String> param) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM class_info WHERE CI_NUM = '" + param.get("ciNum") + "'";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
