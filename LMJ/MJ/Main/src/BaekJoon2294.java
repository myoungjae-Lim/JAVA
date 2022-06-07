import java.util.Arrays;
import java.util.Scanner;
public class BaekJoon2294 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n + 1];
		int[] dp = new int[k + 1];
		
		for(int i = 1; i <= n;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.fill(dp, 100001);
		dp[0] = 0;
		
		for(int i = 1;i <= n;i++) {
			for(int j = arr[i];j <= k;j++) {
				dp[j] = Math.min(dp[j],dp[j - arr[i]] + 1);
			}
		}
		
		System.out.println(dp[k] == 100001 ? -1 : dp[k]);
		scan.close();

	}

}
