public interface Days { // 인터페이스는 추상메소드뿐 아니라 상수 정의 가능
	public static final int NUM = 10;	
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	int WENDSDAY = 3;   // 인터페이스는 상수 밖에 오지 못하기 때문에 생략 가능
}

interface MyInterface { // public static method 정의 가능  
	default void printHello() {
		System.out.println("Hello");
	}
	
	static void myStaticMethod() {
		
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
	
}