public class BlockScope{
	public static void main(String args[]){
		int a = 10; // 지역변수
		{
			int b = 20; //지역변수
			System.out.println("가능한가?");
			System.out.println(a);
			System.out.println(b);
		}
		int b = 30;
		System.out.println(b);
	}
}