import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class FileUpload {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM files WHERE id = ?");
			pstmt.setInt(1, 5);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Blob file = rs.getBlob("file");
				
				InputStream inputStream = file.getBinaryStream();
				FileOutputStream fos = new FileOutputStream(new File("다운로드 받은거.png"));
				
				int b = 0;
				
				while(( b = inputStream.read()) != -1) {
					fos.write(b);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeCon(conn);
		}
		
//		try {
//			conn = DBUtil.getConnection();
//			pstmt = conn.prepareStatement("INSERT into files (id, name, file) values(?, ?, ?)");
//			pstmt.setInt(1, 5);
//			pstmt.setString(2, "파일 이름");
//			pstmt.setBlob(3, new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\춘식\\춘식1.png")));
//			
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}finally {
//			DBUtil.closeStmt(pstmt);
//			DBUtil.closeCon(conn);
//		}
	}
}
