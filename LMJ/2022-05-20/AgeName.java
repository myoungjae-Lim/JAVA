//사용자의 나이와 이름을 입력받아서 
//자기랑 같으면 true 출력하기
import java.util.Scanner;

public class AgeName{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int age = 26;
		String name = "임명재";
		
		System.out.print("나이와 이름을 입력해주세요: ");
		int inputAge = scan.nextInt();
		String inputName = scan.next();
		
		
			
		System.out.println(age == inputAge && name.equals(inputName));
	}
}