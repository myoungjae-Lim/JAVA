public class StringEquals{
	public static void main(String args[]){
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		System.out.println(a == b);
		
		System.out.println(a.equals("He" + llo));
	}
}