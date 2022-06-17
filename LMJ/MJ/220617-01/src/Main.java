import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("왼쪽 수 입력?");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력?");
			int right = scan.nextInt();
		
			System.out.println("나눈 몫: " + (left / right));
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야 합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
		
	}
}