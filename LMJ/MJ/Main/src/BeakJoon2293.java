import java.util.Scanner;

public class BeakJoon2293 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n + 1];
		int[] dp = new int[k + 1];
		
		dp[0] = 1;
		
		for(int i = 1;i <= n;i++) {
			arr[i] = scan.nextInt();
			for(int j = arr[i];j <= k;j++) {
				dp[j] += dp[j - arr[i]];
			}
		}
		
		scan.close();
		System.out.println(dp[k]);
	}

}
