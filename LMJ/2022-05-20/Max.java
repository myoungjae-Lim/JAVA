// 3개의 정수를 입력받아 
// 가장 큰 수를 구하세요.
import java.util.Scanner;

public class Max{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int max = 0;
		 
 		System.out.print("세개의 정수를 입력하세요.: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if(num1 > max){
			max = num1;
			if(num2 > max){
				max = num2;
				if(num3 > max){
					max = num3;
				}
			}
			else{
				if(num3 > max){
					max = num3;
				}
			}
		}
		else{
			if(num2 > max){
				max = num2;
				if(num3 > max){
					max = num3;
				}
			}
			else{
				if(num3 > max){
					max = num3;
				}
			}
		}
		
		System.out.println("세 정수중에서 가장 큰수는 " + max + "입니다.");
	}
}