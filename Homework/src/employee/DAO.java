package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 계정연결

			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클에서 제공하는 Driver 클래스를 연결해준다.
			conn = DriverManager.getConnection(url, user, pw); // 계정연결. Connection 객체를 생성하여 데이터베이스에 연결하기 위한 커넥션 정보를
																// 전달한다.

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}
}
