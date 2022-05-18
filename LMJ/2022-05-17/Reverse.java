import java.util.Scanner;

public class Reverse{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int a;
		System.out.print("정수를 입력하시오.: ");
		a = input.nextInt();
		int one = a%10;
		int ten = (a%100)/10;
		int hund = (a%1000)/100;
		int thou = (a%10000)/1000;
		int tenthou = a/10000;
		
		System.out.println("reverse: " + one + ten + hund + thou + tenthou);
	}
}