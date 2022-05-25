import java.util.Scanner;
public class Star8{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		for(int i = 1;i <= n/2 + 1;i++){
			
			for(int j = 1; j < i;j++){
				System.out.print(" ");
			}
			for(int k = (n/2 + 1) * 2;k >= i*2 ;k--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2;i <= n/2 + 1;i++){
			
			for(int j = n/2 + 1; j > i;j--){
				System.out.print(" ");
			}
			for(int k = 1;k <= i*2 -1;k++){
				System.out.print("*");
			}
			System.out.println();
		} 
	}
}