//사용자가 입력한 5개의 정수 중 가장 큰수를 출력하세요
import java.util.Scanner;

public class FiveMax{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int max = -9999;
		
		System.out.print("5개의 정수를 입력해주세요.");
		for(int i = 0; i < 5; i++){
			int number = scan.nextInt();
			if(number > max){
				max = number;
			}
		}
		System.out.println("5개의 정수중 가장 큰 수는: " + max);
	}
}