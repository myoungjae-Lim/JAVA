// 0 ~ 9까지의 무작위 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게 하여 
// 틀릴 경우 종료

// 예) 랜덤 수가 6일 경우
// 사용자 입력
// 6
// 12
// 18
import java.util.Scanner;
import java.util.Random;

public class Random1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int r = random.nextInt(8);
		r = r + 2;
		
		System.out.printf("%d의 배수를 순서대로 입력하세요.\n", r);
		int i = 1;
		 while(true){
			int input = scan.nextInt();
			if(input == r * i ){
				System.out.println("OK");
			} 
			else{
				System.out.println("X");
				break;
			}
			i++;
		 }
		
		System.out.println("종료");
	}
}