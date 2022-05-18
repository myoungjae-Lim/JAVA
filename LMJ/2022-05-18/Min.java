import java.util.Scanner;

public class Min{
	public static void main(String args[]){
		int a,b,c;
		int min = 999;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 세개를 입력하세요.: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if( min > a){
			min = a;
			if (min > b){
				min = b;
				if (min > c){
					min = c;
				}
			}
			else{
				if (min > c){
					min = c;
				}
			}
		}
		
		System.out.println("가장 작은 값: " + min);
		
	}
}