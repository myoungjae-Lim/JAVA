//사용자에게 정수 하나를 입력받아서 
// 입력 값 -2 ~ +2 범위의 정수를 출력해보세요
// 예) 7 -> 5 6 7 8 9

import java.util.Scanner;

public class IntTwo{
	public static void main(String args[]){
		int i;
	
		System.out.print("정수를 하나 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		
		System.out.printf("%d -> %d %d %d %d %d", i--, --i, ++i, ++i, ++i, ++i);
		
		
	}
}