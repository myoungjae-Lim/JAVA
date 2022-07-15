import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			conn = makeConnection();
			stmt = conn.createStatement();

			result = stmt
					.executeUpdate("INSERT INTO Books (title, price) values (" + "'" + title + "'," + price + ");");
			System.out.println(result + "행이 추가되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;
		
		try {
			conn = makeConnection();
			stmt = conn.createStatement();

			String query = "Select * from books";
			result = stmt.executeQuery(query);
			
			while(result.next()) {
				int id = result.getInt("bookid");
				String title = result.getString("title");
				int price = result.getInt("price");
				
				System.out.println(id + ", " +  title + ", " + price);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (result != null) {
				try {
					result.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		selectAllBook();
	}
}