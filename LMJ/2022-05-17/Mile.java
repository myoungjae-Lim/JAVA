import java.util.Scanner;

public class Mile{
	public static void main(String args[]){
		double mile,km;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		mile = input.nextDouble();
		
		km = mile * 1.609;

		System.out.printf("%.0f 마일은 %.2f 킬로미터입니다.",mile,km);
	}
}