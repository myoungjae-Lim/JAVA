// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기
import java.util.Scanner;

public class NumberSquare{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int square = 1;
		for(int i = 0; i < m; i++){
			square *= n;
		}
		System.out.printf("%d를 %d번 제곱한 수는 %d입니다. ", n, m, square);
	}
}