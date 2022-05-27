public class Box{
	
	// 값/상태 -> 멤버 변수 / 필드
	int length;
	int width;
	int height;
	// 기능 or 동작 -> 메소드
	public void printAllState(){
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	}
	
	//???
	// 박스는 자기자신의 부피를 구해서 정수형 값으로 알려줄수 있음.
	public int volume(){
		return length * width * height;
	}
}
