// 정수 2개를 입력받아서 큰수에서 작은수로 나눈 몫과 나머지를 출력하시오.
import java.util.Scanner;

public class Div{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오.: ");
		int num1 = scan.nextInt();
		System.out.print("정수를 입력하시오.: ");
		int num2 = scan.nextInt();
		if(num1 != 0 && num2 != 0){
			if(num1 > num2){
				System.out.printf(" %d에서 %d를 나눈 몫은 %d이고 나머지는 %d입니다.", num1, num2, num1 / num2, num1 % num2);
			}
			else{
				System.out.printf(" %d에서 %d를 나눈 몫은 %d이고 나머지는 %d입니다.", num2, num1, num2 / num1, num2 % num1);
			}
		}
		else{
			System.out.println("0은 입력할수 없습니다.");
		}
	}
}