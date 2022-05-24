// 1~10000까지 춫력하세요.

public class Loop2 {
	public static void main(String args[]) {
		int i = 0;
		int j = 20;
		
		// while(i < 10000) {
			// System.out.println(i+1);
			// i++;
		// }
		
		// 20~29까지 출력하기
		// while(j < 30) {
			// System.out.println(j) ;
			// j++;
		// }
		
		// 10 ~ 0 까지
		// int k = 10;
		// while(k >=  0) {
			// System.out.println(k);
			// k--;
		// }
		
		// 100보다 작은 3의 배수를 출력해보세요 ~~ 무한히
		// int a = 0;
		// while(a < 100) {
			// if(a % 3 ==0) {
				// System.out.println(a);
			// }
			// a++;
		// }
		
		// ☆
		// ★
		// ☆
		// ★
		// ☆
		// ★
		// ☆
		// ★
				
		int b = 0;
		while(b < 11) {
			if(b % 2 == 0) {
				System.out.println("☆");
			}
			else {
				System.out.println("★");
			}
			b++;
		}
	}
}