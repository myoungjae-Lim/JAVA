import java.util.Scanner;
public class StrReverse{
	public static void main(String args[]){
		String st;
		String s1,s2,s3,s4,s5,s6;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		st = input.nextLine();
		s1 = st.substring(0,1);
		s2 = st.substring(1,2);
		s3 = st.substring(2,3);
		s4 = st.substring(3,4);
		s5 = st.substring(4,5);
		s6 = st.substring(5,6);
		System.out.print("reverse 되었습니다." + s6 + s5 + s4 + s3 + s2 + s1);
	}
}