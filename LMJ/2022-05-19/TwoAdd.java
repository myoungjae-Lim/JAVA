// 사용자가 입력한 두 정수의 합이 0이면 true를 출력하고 
// 그렇지 않으면 false를 출력해보세요.

import java.util.Scanner;

public class TwoAdd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수를 입력해주세요: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int sum = x + y;
		System.out.println("두정수의 합: " + sum);
		System.out.println(sum == 0);
	}
}