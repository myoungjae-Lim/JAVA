// 사용자가 입력한 정수의 약수를 나열하고 총 개수를 출력하세요
import java.util.Scanner;

public class Divisor{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		System.out.print("정수를 입력해주세요");
		int number = scan.nextInt();
		for(int i = 1; i <= number;i++){
			if(number % i == 0){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("약수의 총 개수는" + count);
	}
}