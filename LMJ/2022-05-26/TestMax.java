import java.util.Scanner;
public class TestMax{
	
	public static int max(int a, int b){
		return (a > b) ? a : b;
	}
	
	public static void main(String args[]){
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 6;
		int e = 7;
		
		System.out.println(max(e, max(d,max(c,max(a,b)))));
	}
}