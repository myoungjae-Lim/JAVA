import java.io.File; // 실제 파일이 아닌 외부에 있는 파일을 가리킬수 있는 객체 

public class Main {
	public static void main(String[] args) {
//		File file = new File("d:\\LMJ\\test.txt");
//		
//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.exists());

//		File f2 = new File("d:\\LMJ\\asdf.txt");
//		
//		System.out.println(f2.getName());
//		System.out.println(f2.getPath());
//		System.out.println(f2.exists());
		
		File dir = new File("d:\\LMJ");
		
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println(dir.isFile());
		System.out.println(dir.isDirectory());
	}
}
