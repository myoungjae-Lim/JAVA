import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		 
		try {
			File file = new File("d:\\filetest\\practice.txt");
			int length = (int) file.length();
			byte[] buf = new byte[length];
			
			fis = new FileInputStream(file);
			fis.read(buf);
			
			String result = new String(buf);
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
