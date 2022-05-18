import java.util.Scanner;

public class Div{
	public static void main(String args[]){
		int x,y,q,r;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		x = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		y = input.nextInt();
		
		if(x > y){
			q = x/y;
			r = x%y;
			System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다.", x, y, q, r);
		}
		else{
			q = y/x;
			r = y%x;
			System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다.", y, x, q, r);
		}
	}
}