import java.sql.Connection;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class Main {
	public static void main(String[] args) {
		try (Connection conn = DBUtil.getConnection()){
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		Connection conn = null;
//
//		try {
//			conn = DBUtil.getConnection();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//
//			}
//		}
	}
}
