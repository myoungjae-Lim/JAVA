import java.util.Scanner;

public class Pibo{
	public static void main(String args[]){
		int a=0;
		int b=1;
		int c;
		
		int i;
		Scanner input = new Scanner(System.in);
		System.out.print("몇번째 항까지 출력 하시겠습니까? ");
		i = input.nextInt();
		while(i>1){
			c = a + b;
			if(a==0){
				System.out.printf("%d\t%d\t",a,b);
			}
			System.out.print(c);
			System.out.print("\t");
			a = b;
			b = c;
			i--;
		}
	}
}