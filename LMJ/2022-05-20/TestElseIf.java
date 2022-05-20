// 컵 사이즈 알려주기
// 사용자의 정수를 입력받아서
// 200이상이면 large
// 100~200 medium
// 100미만이면 small
import java.util.Scanner;

public class TestElseIf{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("컵 사이즈를 입력하세요: ");
		int cup = scan.nextInt();
		
		String size;
		
		if(cup < 100){
			size = "small";
		} 
		else if(cup < 200){
			size = "medium";
		} 
		else{
			size = "large";
		}
		
		System.out.println("컵 사이즈는 " + size + "입니다.");
	}
}