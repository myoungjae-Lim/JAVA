import java.util.Scanner;
 
public class Main { 
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int count = 0;
			
			while(n > 0){
				Math.floor(Math.sqrt(n));
				n -= Math.floor(Math.sqrt(n)) * Math.floor(Math.sqrt(n));
				count++;
			}
			System.out.println(count);
	}
 
}