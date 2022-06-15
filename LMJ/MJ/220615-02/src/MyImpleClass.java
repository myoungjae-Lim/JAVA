public final class MyImpleClass extends MySubClass { // final class 종단클래스의 마지막 확장 불가능하게 만듬 

//	@Override
//	public void myMethod() {
//		System.out.println("새롭게 재정의를 하였습니다.");
//	}
	@Override
	public void myMethod2() {
		System.out.println("마이 메소드2 오버라이드 구현");
	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
		
		MySubClass sub = (MySubClass) m;
		
		sub.myMethod();
		sub.myMethod2();
	}
	
}