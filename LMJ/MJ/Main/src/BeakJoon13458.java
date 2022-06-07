import java.util.Scanner;
public class BeakJoon13458 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n + 1];
		
		for(int i = 1; i <= n;i++) {
			a[i] = scan.nextInt();
		}
		
		int b = scan.nextInt();
		int c = scan.nextInt();
		long sum = 0;
		scan.close();
		for(int i = 1;i <= n; i++) {
			if(a[i] <= b) {
				sum += 1;
			}
			else {
				a[i] -= b;
				sum += 1;
				if(a[i] % c == 0) {
					sum += a[i] / c;
				}
				else {
					sum += a[i] / c + 1;
				}
			}
		}
		System.out.println(sum);
		
		
	}

}
