import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.co.greenart.dbutil.DBUtil;

/*
 * restaurants 테이블에 대한 db access를 수행하는 객체를 작성해보세요
 * 
 * 메소드(입력값) : 반환값				throws 예외
 * 
 * C(상호명, 전화번호, 주소) or C(음식점) : 행 개수
 * R() : List<음식점>
 * R(id) : 음식점
 * U(id, 상호명, 전화번호, 주소) or U(음식점) : 행 개수 
 * D(id) : 행 개수 
 * 
 * ---------------------------------------------------
 * 
 * 여러 행의 음식점 추가 
 */
public class RestaurantsRepository {
	private Restaurants resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String callNumber = rs.getString("callNumber");
		String address = rs.getString("address");

		return new Restaurants(id, name, callNumber, address);
	}

	// restaurants 삽입 sql 만들기
	public String insert() {
		String insert = null;
		System.out.println("가게이름, 전화번호, 주소를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String callNumber = scan.nextLine();
		String address = scan.nextLine();

		if ((name != null) && (callNumber != null) && (address != null)) {
			insert = "('" + name + "', '" + callNumber + "', '" + address + "')";
		}

		return insert;
	}
	
	// 여러행 추가
	public int adds() throws SQLException {
		String query = "INSERT INTO restaurant (name, callnumber, address) values ";
		int insertCount = 0;
		
		do {
			String insert = insert();
			if (insertCount != 0) {
				query = query + ", " + insert;
			} else {
				query = query + insert;
			}
			
			insertCount++;
			
			System.out.println("그만 추가 하시려면 0번");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			if (n == 0) {
				break;
			}
			
		} while (true);

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}

	}

	// 추가
	public int add(Restaurants restaurants) throws SQLException {
		String query = "INSERT INTO restaurant (name, callnumber, address) values " + "('" + restaurants.getName()
				+ "', '" + restaurants.getCallNumber() + "', '" + restaurants.getAddress() + "')";
		System.out.println("추가: " + query);

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}

	}

	// 전체목록
	public List<Restaurants> list() throws SQLException {
		String query = "SELECT * FROM restaurant";
		List<Restaurants> list = new ArrayList<>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(resultMapping(rs));
			}

		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}

		return list;

	}

	// 검색
	public Restaurants search(int id) throws SQLException {
		String query = "Select * from restaurant where id = " + id;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}

	}

	// 수정
	public int update(Restaurants restaurants) throws SQLException {
		String query = "UPDATE restaurant" + " SET name = '" + restaurants.getName() + "', callNumber = '"
				+ restaurants.getCallNumber() + "', address = '" + restaurants.getAddress() + "'";
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			return stmt.executeUpdate(query);

		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}

	}

	// 삭제
	public int delete(int id) throws SQLException {
		String query = "Delete from restaurant where id = " + id;
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			return stmt.executeUpdate(query);

		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeStmt(stmt);
		}

	}
}
