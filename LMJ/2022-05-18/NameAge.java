import java.util.Scanner;

public class NameAge{
	public static void main(String args[]){
		String name;
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = input.nextLine();
		System.out.print("나이: ");
		age = input.nextInt();
		
		System.out.printf("이름은 %s이고 나이는 %d세입니다.",name,age);
		
	}
}