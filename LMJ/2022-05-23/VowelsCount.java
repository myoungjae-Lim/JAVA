// 사용자가 입력한 영단어(latin 문자열)에서 모음(a e i o u)이 몇 개인지 출력하세요
import java.util.Scanner;

public class VowelsCount{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요.");
		String str = scan.nextLine();
		int count = 0;
		for(int i = 0; i < str.length();i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				count++;
			}
		}
		System.out.println("입력한 문자열에서 모음의 개수는" + count + "입니다.");
	}
}