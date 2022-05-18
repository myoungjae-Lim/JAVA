import java.util.Scanner;

public class Pbank{
	public static void main(String args[]){
		int fivehund,hund,fifty,ten;
		
		Scanner input = new Scanner(System.in);
		System.out.print("500원 개수: ");
		fivehund = input.nextInt();
		System.out.print("100원 개수: ");
		hund = input.nextInt();
		System.out.print("50원 개수: ");
		fifty = input.nextInt();
		System.out.print("10원 개수: ");
		ten = input.nextInt();

		int sum = fivehund*500 + hund*100 + fifty*50 + ten*10;
			
		System.out.println("저금통에 들어있는 돈의 액수는: " + sum);
	}
}