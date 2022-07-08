import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
//		File file = new File("d:\\filetest");
//		System.out.println(file.exists());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		
//		boolean result = file.mkdir();
//		System.out.println(result);
//		
//		// d드라이브에 filetest 폴더안에 abc 폴더를 생성해보세요
//		
//		File abcFile = new File("d:\\filetest\\abc");
//		
//		abcFile.mkdir();
//		
//		File file2 = new File("d:\\filetest\\abc\\..\\def");
//		file2.mkdir();
//		try {
//			File file3 = file2.getCanonicalFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			textFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(textFile);
		
	}
}