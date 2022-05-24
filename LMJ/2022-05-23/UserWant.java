// 0부터 1씩 증가하는 수를 출력하기.
// 사용자가 입력한 원하는 반복 만큼만. 
import java.util.Scanner;

public class UserWant{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 숫자를 입력해주세요.: ");
		int i = scan.nextInt();
		int j = 0;
		while(j < i){
			System.out.println(j);
			j++;
		}
	}
}