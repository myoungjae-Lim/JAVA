public class TestMethod{
	public static void printRepeat(){
		for(int i = 0;i < 3; i++){
			System.out.println("반복중");
		}
	}
	public static void main(String args[]){
		System.out.println("프로그램 시작~");
		int number = 10;
		printRepeat();
		
		System.out.println("프로그램 끝~");
	}
}