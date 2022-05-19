// 사용자가 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// false
import java.util.Scanner;

public class Under{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("3대 측정값을 입력하세요: ");
		int ben = scan.nextInt();
		int squ = scan.nextInt();
		int dead = scan.nextInt();
		int sum = ben + squ + dead;
		
		System.out.println(sum >= 500);
	}
} 