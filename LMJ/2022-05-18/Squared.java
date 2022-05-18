//사용자에게 정수 하나를 입력받아서
//제곱 값을 출력하는 프로그램
import java.util.Scanner;

public class Squared{
	public static void main(String args[]){
		int a;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오.: ");
		a = input.nextInt();
		
		System.out.println("제곱 값: " + a*a);
	}
}