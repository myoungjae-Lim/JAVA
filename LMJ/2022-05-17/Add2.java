import java.util.Scanner;
public class Add2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;

		System.out.print("첫 번째 숫자를 입력하세요: ");
		x = input.nextInt();

		System.out.print("두 번째 숫자를 입력하세요: ");
		y = input.nextInt();
		
		sum = x + y;

		System.out.println("두수의 합: " + sum);
		 
	}
}