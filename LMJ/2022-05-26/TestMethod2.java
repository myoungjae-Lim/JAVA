public class TestMethod2{
	public static int sum(){
		int a = 10;
		int b = 20;
		int sum = a + b;
		return sum;
	}
	
	// pi 메소드
	public static double pi(){
		return 3.14;
	}
	
	public static void main(String args[]){
		System.out.println("프로그램 시작~");
		int result = sum();
		double pi = pi();
		System.out.println(pi);
		System.out.println(result);
		System.out.println("프로그램 끝~");
	}
}