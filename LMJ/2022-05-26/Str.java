// 3. 전달받은 두 문자열의 길이 값을 반환하는 메소드 
public class Str{
	public static int strLength(String a, String b){
		return a.length() + b.length();
	}
	public static void main(String args[]){
		int i = strLength("hello","world");
		System.out.println(i);
	}
}