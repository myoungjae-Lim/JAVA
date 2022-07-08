import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		FileInputStream in = null; // 바이트 단위 read
		FileOutputStream out = null; // 바이트 단위 write

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}