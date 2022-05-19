// 사용자가 입력한 정수가
// 짝수면 true
// 홀수면 false를 출력해보세요.
import java.util.Scanner;

public class Odd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int i = scan.nextInt();
		System.out.println((i % 2) == 0);
	}
}