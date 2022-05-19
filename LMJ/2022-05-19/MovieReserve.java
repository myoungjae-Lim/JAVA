import java.util.Scanner;
public class MovieReserve{
	public static void main(String args[]){
		int reserve;
		int[] seats = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
			reserve = scan.nextInt();			
		
			if(reserve == 1){
				System.out.println("-------------------------------------");
				System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
				System.out.println("-------------------------------------");
				System.out.printf(" %d %d %d %d %d %d %d %d %d %d \n",seats[0],
				seats[1],seats[2],seats[3],seats[4],seats[5],seats[6],seats[7],seats[8],seats[9]);
				System.out.print("몇번째 좌석을 예약하시겠습니까?");
				int i = scan.nextInt();
				seats[i-1] = 1;
				System.out.println("예약되었습니다.\n");
				
			}
			else{
				return;
			}
		}
		
	}
}