// 사용자가 입력한 5개의 정수의 합 구하기
import java.util.Scanner;

public class SumFive{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 5; i++){
			System.out.print("정수를 입력하세요. ");
			int input = scan.nextInt();
			sum += input;
		}
		System.out.println("5개의 정수의 합" + sum);
	}
}
