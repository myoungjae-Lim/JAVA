import java.util.Scanner;

public class BaekJoon12865 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[][] arr = new int[n + 1][2];
		
		for(int i = 1; i <= n;i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		scan.close();
		int[][] dp = new int[n + 1][k + 1];
		
		for(int i = 1; i <= k;i++) {
			for(int j = 1; j <= n;j++) {
				dp[j][i] = dp[j - 1][i];
				if(i - arr[j][0] >= 0) {
					dp[j][i] = Math.max(dp[j - 1][i],dp[j - 1][i - arr[j][0]] + arr[j][1]);
				}
			}
		}
		System.out.println(dp[n][k]);
	}
}
