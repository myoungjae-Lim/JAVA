import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy2 {
	public static void main(String[] args) {
		FileReader inputStream = null; // 단어 단위
		FileWriter outputStream = null; // 단어 단위
		
		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");
			int c;
			
			while((c = inputStream.read()) != -1) {
				System.out.print((char)(c));
				outputStream.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
