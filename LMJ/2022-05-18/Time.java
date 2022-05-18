// 사용자에게 초단위의 시간을 입력받아 
// 시간 분 초로 변환을 하는 프로그램
import java.util.Scanner;

public class Time{
	public static void main(String args[]){
		int seconds;
		int hour, minutes;
		
		Scanner input = new Scanner(System.in);
		System.out.print("시간초를 입력하세요: ");
		seconds = input.nextInt();
		
		hour = seconds/3600;
		minutes = (seconds%3600)/60;
		seconds = seconds%60;
		
		System.out.print(hour + "시간 ");
		System.out.print(minutes + "분 ");
		System.out.print(seconds + "초 ");
	}
}