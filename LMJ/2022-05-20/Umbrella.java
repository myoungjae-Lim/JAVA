import java.util.Scanner;

public class Umbrella { 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("오늘의 날씨? ");
		String weather = scan.nextLine();
		
		if(weather.equals("비")){
			System.out.println("우산을 챙겨가세요");
		}
		
		System.out.println("좋은 하루 보내세요");
	}
}