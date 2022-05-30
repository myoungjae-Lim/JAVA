import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] arr = new long[n];
		long[] a = new long[n];
		
		for(int i = 0;i < n;i++){
			arr[i] = scan.nextLong();	
		}
		Arrays.sort(arr);
		
		a[0] = arr[0];
		for(int i = 1; i < n;i++){
			if(arr[i] == arr[i - 1]){
				
			}
		}
	}
	
	
}
