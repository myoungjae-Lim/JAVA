/*
 * 도서 관리 프로그램
 *  가격순으로 정렬 해놓기 이러면 그냥 배열 출력만 하면됨
 *1. 목록 보기(가격순으로(같을 때는 어떻게? 사전순으로 출력)
 *2. 분야를 선택해서 해당 분야만 
 *
 *3. 상세보기 
 *4. 도서 정보 수정
 *5. 도서 정보 추가 
 *
 * 필드: 제목, 작가, 출판사, 장르, 가격
 */

// 1. 작별인사 / 김영하 / 복복서가/ 장편소설 / 12,600원
// 2. 불편한 편의점 / 김호연 / 나무옆의자 / 장편소설 / 12,600원  
// 3. 지금 알고 있는 걸 그때도 알았더라면 / 류시화 / 열림원 / 시집 / 8100원
// 4. 코스모스 / 칼 세이건 / 사이언스 북스 / 과학 공학 / 16,650원
// 5. 여행의 이유 / 김영하 / 문학동네 / 에세이 / 12,150원

public class Book {
	private String title;
	private String name;
	private String publisher;
	private String genre;
	private int price;
	
	
	public Book(String title, String name, String publisher, String genre, int price) {
		this.title = title;
		this.name = name;
		this.publisher = publisher;
		this.genre = genre;
		this.price = price;
	}

	public Book() {
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void allPrint() {
		System.out.println("제목: " + title);
		System.out.println("작가: " + name);
		System.out.println("출판사: " + publisher);
		System.out.println("분야: " + genre);
		System.out.println("가격: " + price);
		System.out.println();
	}
	
	
}
