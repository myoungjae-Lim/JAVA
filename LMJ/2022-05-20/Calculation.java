// 정수 2개와 연산자 (문자열)등 을 입력받아 사칙연산을 수행하는 계산기 프로그램 
import java.util.Scanner;

public class Calculation{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		
		System.out.print("정수 2개와 연산자을 입력하시오.: ");
		int number1 = scan.nextInt();
		String calc = scan.next();
		int number2 = scan.nextInt();
		
		if(calc.equals("+")){
			sum = number1 + number2;
		}
		else if(calc.equals("-")){
			sum = number1 - number2;
		}
		else if(calc.equals("*")){
			sum = number1 * number2;
		}
		else if(calc.equals("/")){
			sum = number1 / number2;
		}
		else{
			System.out.println("올바르지 않은 입력입니다.");
			return;
		}

		System.out.println("결과값: " + sum);
		
		
	}
}