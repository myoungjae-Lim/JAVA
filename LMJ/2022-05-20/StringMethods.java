public class StringMethods{
	public static void main(String args[]){
		String hello = "hello";
		
		int index = hello.indexOf("o");
		System.out.println(index);
		
		int notFound = hello.indexOf("a");
		System.out.println(notFound);
		
		int index3 = hello.lastIndexOf("l",2);
		System.out.println(index3);
	}
}