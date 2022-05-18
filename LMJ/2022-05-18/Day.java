import java.util.Scanner;

public class Day{
	public static void main(String args[]){
		int year, month, day;
		int days;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("연도를 입력하시오: ");
		year = input.nextInt();
		System.out.print("월을 입력하시오: ");
		month = input.nextInt();
		System.out.print("일을 입력하시오: ");
		day = input.nextInt();
		
		if(month < 3){
			month = month +12;
			year = year - 1; 
		}
		
		days = day + (26 * (month + 1))/10 + year + year/4 + 6*(year/100) + year/400; 
		
		switch(days%7){
			case 1:
				System.out.printf("%d년 %d월 %d일은 일요일입니다.", year, month, day);
				break;
			case 2:
				System.out.printf("%d년 %d월 %d일은 월요일입니다.", year, month, day);
				break;
			case 3:
				System.out.printf("%d년 %d월 %d일은 화요일입니다.", year, month, day);
				break;
			case 4:
				System.out.printf("%d년 %d월 %d일은 수요일입니다.", year, month, day);
				break;
			case 5:
				System.out.printf("%d년 %d월 %d일은 목요일입니다.", year, month, day);
				break;
			case 6:
				System.out.printf("%d년 %d월 %d일은 금요일입니다.", year, month, day);
				break;
			case 0:
				System.out.printf("%d년 %d월 %d일은 토요일입니다.", year, month, day);
				break;
		}

	}
}