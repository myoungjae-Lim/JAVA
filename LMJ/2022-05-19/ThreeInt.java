import java.util.Scanner;

public class ThreeInt{ 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		
		System.out.print("세정수를 차례대로 입력하세요.: ");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		System.out.print("세 정수가 이어지는 숫자입니까? ");
		System.out.println((y - x == 1) && (z - y == 1));
	}
}