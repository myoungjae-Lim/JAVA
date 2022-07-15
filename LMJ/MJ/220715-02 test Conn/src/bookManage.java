import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import kr.co.greenart.dbutil.DBUtil;

/*
 * my_db.books
 * 
 * 도서 관리 프로그램 
 * 추가 
 * 전체 목록
 * (아이디나 제목이나 가격 등으로 검색 가능)
 * 삭제
 * 수정
 * 사용자 입력으로 받아서 데이터베이스 정보 갱신되게 만들기
 */

public class bookManage {
	private static List<Book> list;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		run();
	}

//	books table 전체 출력
	public static void bookPrintAll() {
		list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from books");

			while (rs.next()) {
				int bookId = rs.getInt("bookid");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				list.add(new Book(bookId, title, price));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}
		System.out.println(list);
	}

//	books table Insert 
	public static void bookInsert() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			scan.nextLine();
			System.out.print("제목 입력해주세요. ");
			String title = scan.nextLine();

			if (title.length() > 40) {
				while (title.length() > 40) {
					System.out.println("제목은 40글자 까지에요.");
					System.out.print("제목을 다시 입력해주세요. ");
					title = scan.nextLine();
				}
			}

			System.out.print("가격 입력해주세요. ");
			int price = scan.nextInt();
			scan.nextLine();
			
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			String query = "INSERT INTO Books (title, price) values (" + "'" + title + "'," + price + ");";
			int result = stmt.executeUpdate(query);

			if (result == 1) {
				System.out.println("책 추가 성공");
			} else {
				System.out.println("책 추가 실패");
			}

		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("같은 이름의 책을 추가 할수 없어요");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("올바른 입력이 아닙니다.");
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}
	}

//	books table Search
	public static void bookSearch() {
		list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			String where = "";
			System.out.println("어느걸로 검색할지 선택하세요");
			System.out.print("1.bookid 2.title 3.price");
			String s = scan.next();
			s = s.toLowerCase();

			if (s.equals("1") || s.equals("bookid")) {
				where += "where bookid = ";
				System.out.print("bookid 입력: ");
				int search = scan.nextInt();
				scan.nextLine();
				where += search;
			} else if (s.equals("2") || s.equals("title")) {
				where += "where title = ";
				System.out.print("title 입력: ");
				scan.nextLine();
				String search = scan.nextLine();
				where += "'" + search + "'";
			} else if (s.equals("3") || s.equals("price")) {
				where += "where price = ";
				System.out.print("price 입력: ");
				int search = scan.nextInt();
				scan.nextLine();
				where += search;
			} else {
				System.out.println("아무것도 선택하지 않으셨습니다.");
				System.out.println("모든 책을 출력하겠습니다.");
			}

			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			String query = "select * from books ";
			rs = stmt.executeQuery(query + where);

			while (rs.next()) {
				int bookId = rs.getInt("bookid");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				list.add(new Book(bookId, title, price));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}
		System.out.println(list);
	}

//	books table Delete
	public static void bookDelete() {
		Connection conn = null;
		Statement stmt = null;

		try {
			String query = "Delete From books where ";
			System.out.println("어느걸로 삭제할지 선택하세요");
			System.out.print("1.bookid 2.title 3.price");
			String s = scan.next();
			s = s.toLowerCase();

			if (s.equals("1") || s.equals("bookid")) {
				System.out.print("bookid 입력: ");
				int search = scan.nextInt();
				scan.nextLine();
				query += "bookid = " + search;
			} else if (s.equals("2") || s.equals("title")) {
				System.out.print("title 입력: ");
				scan.nextLine();
				String search = scan.nextLine();
				query += "title = " + "'" + search + "'";
			} else if (s.equals("3") || s.equals("price")) {
				System.out.print("price 입력: ");
				int search = scan.nextInt();
				scan.nextLine();
				query += "price = " + search;
			} else {
				System.out.println("아무것도 선택하지 않으셨습니다.");
			}

			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(query);

			if (result == 1) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}

		} catch (SQLSyntaxErrorException e) {
			System.out.println("삭제 안함");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}
	}

//	books table Update
	public static void bookUpdate() {
		Connection conn = null;
		Statement stmt = null;

		try {
			System.out.println("수정할 bookid 입력 하세요. ");
			String bookid = " where bookid = " + scan.nextInt();
			scan.nextLine();
			System.out.println("새로운 책이름 입력: ");
			String title = "title = '" + scan.nextLine() + "', ";
			System.out.println("가격 입력: ");
			String price = "price = " + scan.nextInt();
			scan.nextLine();
			String query = "Update books set " + title + price + bookid;

			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(query);

			if (result == 1) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeCon(conn);
		}

	}

	public static void run() {
		while (true) {
			System.out.print("1:전체 목록\n2:도서 추가\n3:도서 검색\n4:도서 삭제\n5:도서 수정\n6:종료");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				bookPrintAll();
				break;
			case 2:
				bookInsert();
				break;
			case 3:
				bookSearch();
				break;
			case 4:
				bookDelete();
				break;
			case 5:
				bookUpdate();
				break;
			case 6:
				return;
			default:
				break;
			}
		}
	}
}
