package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static final String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/kd";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kd1824java";
	
	// 즉시 실행 영역, 메인메소드 실행하면 무조건 실행됨, static만 빼면 메모리를 생성할 때 실행되는데 사실상 그렇게 쓸 일은 없음
	static {
		try {
			Class.forName(DRIVER_CLASS);
			System.out.println("내가 나오면 드라이버 잘 찾은거임");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		try {
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
