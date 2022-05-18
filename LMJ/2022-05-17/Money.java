import java.util.Scanner;

public class Money{
	public static void main(String args[]){
		int money;
		int sum;
		int tax;
		int extra;

		Scanner input = new Scanner(System.in);
		System.out.print("받은 돈: ");
		money = input.nextInt();
		System.out.print("상품의 총액: ");
		sum = input.nextInt();	
		
		tax = sum / 10;
		extra = money - sum;
		System.out.println("부가세: " + tax);
		System.out.println("잔돈: " + extra);
	}
}