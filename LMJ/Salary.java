import java.util.Scanner;

public class Salary{
	public static void main(String args[]){
		int salary;
		int deposit;

		Scanner input = new Scanner(System.in);
	
		System.out.print("월급을 입력하세요: ");
		salary = input.nextInt();
		
		deposit = 10*12*salary;
		System.out.print("10년 동안의 저축액: " + deposit);
	}
}