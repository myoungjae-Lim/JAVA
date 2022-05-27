import java.util.Scanner;
public class TestDate{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Date date = new Date();
		
		System.out.print("년 월 일을 입력해주세요");
		date.years = scan.nextInt();
		date.month = scan.nextInt();
		date.days = scan.nextInt();
		
		date.slashPrint();
		date.barPrint();
	}
}