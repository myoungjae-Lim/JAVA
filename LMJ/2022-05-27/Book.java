// 책 클래스 
// 필드 : 제목, 저자
// 메소드 : 제목과 저자를 콘솔에 출력 가능

// 위의 클래스를 테스트 할수 있는 main 메소드를 포함하는 클래스를 작성하고 
// 인스턴스화 하여, 필드값을 대입연산 후 출력메소드를 호출하여 콘솔에서 확인

public class Book{
	String title;
	String author;
	
	public void printAll(){
		System.out.printf("제목: %s\n저자: %s\n", title, author);
	} 
}