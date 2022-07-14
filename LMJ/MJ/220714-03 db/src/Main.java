import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world";
		String id = "root";
		String password = "root";
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // com.mysql.cj.jdbc 에있는 Driver 클래스
			System.out.println("드라이버 적재 성공");
			
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("데이터 베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결에 실패하였습니다.");
			System.out.println(e.getMessage());
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결을 닫았습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
