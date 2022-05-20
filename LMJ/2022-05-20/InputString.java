import java.util.Scanner;

public class InputString{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		// 문자열 입력하기전에 정수 입력을 받으면 엔터를 인식해 빈문자열을 출력해낸다. 
		//그걸 방지하기위해 scan.nextLine();을 한번 호출해주면 해결된다.
		System.out.println("한줄을 입력하세요");
		scan.nextLine();
		String line = scan.nextLine();
		
		System.out.println(line);
	}
}