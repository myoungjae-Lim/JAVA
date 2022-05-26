public class Methods{
	// 숫자 하나가 짝수, 홀수 인지 알고 싶음. 이 기능을 할 수 있는 메소드.
	public static int isEven(int a){
		if(a % 2 == 0){
			return 2;
		} else{
			return 1;
		}
	}
	
	public static int increase(int a){
		return ++a;
	}
	
	public static void main(String args[]){
		int a = 10;
		a = increase(a); //call by value		
		System.out.println(a);
		
		int result = isEven(a);
		if(result == 1){
			System.out.println("홀수 입니다.");
		} else{
			System.out.println("짝수 입니다.");
		}
	}
}
