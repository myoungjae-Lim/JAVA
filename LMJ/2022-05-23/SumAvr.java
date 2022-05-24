// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후.
// 정수를 입력하면 
// 합과 평균을 구해서 출력하는 프로그램.

// 짝수 의 합 평균
// 홀수 의 합 평균
import java.util.Scanner;

public class SumAvr{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int oddSum = 0;
		int evenSum = 0;
		int oddCount = 0;
		int evenCount = 0;

		System.out.print("몇 개의 정수를 입력 받으시겠습니까? ");
		int count = scan.nextInt();
		
		System.out.printf("%d개의 정수를 입력하세요. \n", count);
		for(int i = 0;i < count;i++){
			int num = scan.nextInt();
			if(num % 2 == 0){
				evenSum += num;
				evenCount++;
			}
			else{
				oddSum += num;
				oddCount++;
			}
			
		}
		
		System.out.printf("%d개의 짝수의 합은 %d이고 평균은 %.2f입니다.\n", evenCount, evenSum, (double)evenSum / (double)evenCount);
		System.out.printf("%d개의 홀수의 합은 %d이고 평균은 %.2f입니다.\n", oddCount, oddSum, (double)oddSum / (double)oddCount);
	}
}