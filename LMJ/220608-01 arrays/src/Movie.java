import java.util.Scanner;

public class Movie {

	public static void printSeats(int[] arr) {
		System.out.print("------------------------\n");
		System.out.print("1 2 3 4 5 6 7 8 9 10\n");
		System.out.print("------------------------\n");
		
		for(int i : arr) {
			System.out.print(i + " " );
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seats = new int[10];
		while(true) {
			System.out.print("좌석을 예약하시겠습니까?(1또는0) ");
			int n = scan.nextInt();
			switch(n) {
				case 1:
					printSeats(seats);
					System.out.print("몇번째 좌석을 예약하시겠습니까? ");
					int m = scan.nextInt();
					seats[m - 1] = 1;
					break;
				case 0:
					return;
			}
		}

	}

}
