import java.util.Scanner;

public class SumForUser{
	public static void main(String args[]){
		//사용자가 범위를 지정 (시작-끝 입력)
		// 합
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("시작 정수를 입력하세요: ");
		int start = scan.nextInt();
		System.out.print("마지막 정수를 입력하세요: ");
		int end = scan.nextInt();
		
		for(;start <= end; start++){
			sum += start;
		}
		System.out.println(sum);
	}
}