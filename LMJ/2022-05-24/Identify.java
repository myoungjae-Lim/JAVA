// 주민번호를 입력하면
// 성별을 출력하는 프로그램
// 예) xxxxxx-1xxxxxx
import java.util.Scanner;

public class Identify{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String identify = scan.nextLine();
		char c = identify.charAt(7);
		switch(c){
			case '1':
			case '3':
				System.out.println("남성 입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여성 입니다.");
				break;
			default:
				System.out.println("사람이 아닙니다.");
		}
	}
}