//사용자에게 비밀번호를 물어보고 동일할 경우 통과
//최개 3번의 기회를 줌
import java.util.Scanner;

public class Password{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String s = "abcdefg";
		int count = 0;
		
		while(true){
			String str = scan.next();
			if(count == 3){
				System.out.println("입력 가능 횟수를 초과 하셨습니다.");
				break;
			}
			if(s.equals(str)){
				System.out.println("통과");
				break;
			} else{
				System.out.println("비밀번호를 다시 입력하세요.");
			}
			count++;
		}
	}
}