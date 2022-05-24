import java.util.Scanner;

public class Gugudan{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("보고싶은 구구단의 단수를 입력하세요.: ");
		int i = scan.nextInt();
		int j = 1;
		while(j < 10){
			System.out.printf( " %d * %d = %d\n", i, j, i * j);
			j++;
		}
		
		// while(i < 10){
			// int j = 1;
			// while(j < 10){
				// System.out.printf(" %d ", i*j);
				// System.out.print("\t");
				// j++;
			// }
			// System.out.println();
			// i++;			
		// }
		
	}
}