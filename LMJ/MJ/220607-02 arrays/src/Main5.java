import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
		}
		
		scan.close();
		
		for(int i = 4;i >= 0;i--) {
			System.out.println(arr[i]);
		}

	}

}
