//Fibonacci 수열 
//1 1 2 3 5 8 13 21 34 ...
// 100이하
public class Fibonacci{
	public static void main(String args[]){
		int a=1;
		int b=1;
		int c = 0;

		while(a + b <= 100){
			c = a + b;
			if(b == 1){
				System.out.printf("%d\t%d\t",a,b);
			}
			System.out.print(c);
			System.out.print("\t");
			a = b;
			b = c;
			
		}
	}
}