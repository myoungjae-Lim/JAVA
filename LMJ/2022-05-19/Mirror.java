import java.util.Scanner;

public class Mirror{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i;
		
		System.out.print("정수를 입력해주세요: ");
		i = scan.nextInt();
		
		System.out.print("입력한 네자리 정수의 좌우가 같나요? ");
		System.out.print( (i % 10) == (i / 1000) && ((i % 1000) / 100) == (i % 100) / 10); 
		
	}
}