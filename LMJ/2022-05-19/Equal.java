import java.util.Scanner;

public class Equal{
	public static void main(String args[]){
		String hello = "hello";
		String s;
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		
		if(s.equals(hello)){
			System.out.println("기존 아이디와 일치합니다. ");
		}
		else{
			System.out.println("기존 아이디와 불일치합니다. ");
		}
	}
}