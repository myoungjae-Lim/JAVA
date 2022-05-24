// 자판기 프로그램
// 돈 입력
// 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요
import java.util.Scanner;

public class Drink{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		int sum = 0;
		int cokeCount = 0;
		int ciderCount = 0;
		
		System.out.print("돈을 투입해주세요.");
		int money = scan.nextInt();
		
		while(true){
			System.out.print(" 1번 콜라: 1500 2번 사이다: 1300 3번 계산");
			int number = scan.nextInt();
			
			if(number == 1){
				result += 1500;
				cokeCount++;
				if(result > money){
					System.out.println("잔액이 부족합니다.");
					result -= 1500;
					cokeCount--;
				}
			
			} else if(number == 2){
				result += 1300;
				ciderCount++;
				if(result > money){
					System.out.println("잔액이 부족합니다.");
					result -= 1300;
					ciderCount--;
				}
			} else if(number == 3){
				sum = money - result;
				break;
			}
			
		}
		System.out.printf("구입한 캔의 개수는 콜라%d개 사이다%d개 이고 거스름돈은%d원 입니다.", cokeCount, ciderCount, sum);
	}
}