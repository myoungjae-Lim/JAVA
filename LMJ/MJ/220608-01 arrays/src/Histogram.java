import java.util.Scanner;

public class Histogram {
	
	public static String[] starCount(int j) {
		Scanner scan = new Scanner(System.in);
		String[] star = new String[j];
		
		for(int i = 0;i < star.length;i++) {
			star[i] = "";
		}	
		
		for(int i = 0;i < star.length;i++) {
			int n = scan.nextInt();
			if(n <= 10) {
				star[0] += "*";
			}
			else if(n <= 20) {
				star[1] += "*";
			}
			else if(n <= 30) {
				star[2] += "*";
			}
			else if(n <= 40) {
				star[3] += "*";
			}
			else if(n <= 50) {
				star[4] += "*";
			}
			else if(n <= 60) {
				star[5] += "*";
			}
			else if(n <= 70) {
				star[6] += "*";
			}
			else if(n <= 80) {
				star[7] += "*";
			}
			else if(n <= 90) {
				star[8] += "*";
			}
			else if(n <= 100) {
				star[9] += "*";
			} 
			else {
				if(i != 0) {
					i--;
				}
				continue;
			}
		} 
		return star;
	}
	
	public static void main(String[] args) {		
		
		String[] star = starCount(10);
		int j = 1;
		
		for(int i = 0;i < star.length;i++) {			
			System.out.printf("%d - %d: %s\n", j, j+9,star[i]);
			j += 10;
		}

	}

}
