// 1. 사용자가 입력한 정수가 0이상이며 7의 배수일 때만 true를 출력하세요.
import java.util.Scanner;

public class ZeroHigh{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int i = scan.nextInt();
		System.out.print("0이상이면서 7의배수 입니까? ");
		System.out.println((i >=0) && (i%7 == 0));
		
	}
}