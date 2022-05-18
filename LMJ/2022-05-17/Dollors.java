import java.util.Scanner;

public class Dollors{
	public static void main(String args[]){
		double dollor;
		int won;
		
		System.out.print("원화를 입력하라: ");
		Scanner input = new Scanner(System.in);
		won = input.nextInt();
		
		dollor = (double)won / 1392.83;

		System.out.printf("%.2f달러 입니다.",dollor);
	}
}