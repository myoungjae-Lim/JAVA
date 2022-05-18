import java.util.Scanner;

public class Height{
	public static void main(String args[]){
		int cm,feet;
		double inch;
		
		System.out.print("키를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		cm = input.nextInt();
		inch = cm/2.54;			
		feet = (int)inch/12;		
		inch %= 12;
		
		System.out.printf("%dcm는 %d피트 %f인치입니다.", cm, feet, inch);
	}
}