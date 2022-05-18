import java.util.Scanner;

public class Alpa{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.print("영문자 하나를 입력하세요.: ");
		char c = input.next().charAt(0);
		
		switch(c){
			case 'a': 
				System.out.println("모음입니다.");
				break;
			case 'e': 
				System.out.println("모음입니다.");
				break;
			case 'i': 
				System.out.println("모음입니다.");
				break;
			case 'o': 
				System.out.println("모음입니다.");
				break;
			case 'u': 
				System.out.println("모음입니다.");
				break;
			default :
				System.out.println("자음입니다.");
				break;
		}
	}
}