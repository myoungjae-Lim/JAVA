import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrintCalendar {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd eee");
		String result = formatter.format(now);
		
		LocalDate firstDay = LocalDate.of(now.getYear(), now.getMonthValue(), 1);
		int dayOfweek = firstDay.getDayOfWeek().getValue();
		int length = now.lengthOfMonth();
		
		System.out.println("오늘:" + result);
		System.out.println("일    월    화    수   목   금   토");
		for(int i = 0; i < dayOfweek;i++) {
			System.out.print("   ");
		}
		for(int i = 1; i < length;i++) {
			System.out.printf("%02d ", i);
			dayOfweek++;
			if(dayOfweek % 7 == 0) {
				System.out.println();
			}
		}
	}

}
