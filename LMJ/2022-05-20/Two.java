// 사용자에게 정수를 입력받아
// 짝수면 "짝수입니다." 출력
// 홀수면 "홀수입니다." 출력
import java.util.Scanner;

public class Two{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int i = scan.nextInt();
		
		if(i%2 == 0){
			System.out.println("짝수입니다.");
		}
		else{
			System.out.println("홀수입니다.");
		}
		
	}
}