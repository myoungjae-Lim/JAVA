import java.util.Scanner;
public class TestMethod3{
	public static int sum(int a, int b){
		return a + b;
	}
	
	public static int multiply(int a, int b){
		return a * b;
	}
	
	public static void main(String args[]){
		int result = sum(5,6);
		System.out.println(result);
		
		int multiple = multiply(100, 200);
		System.out.println(multiple);
	}
}