public class Swap{
	public static void main(String args[]){
		int a = 10;
		int b = 55;
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}
}