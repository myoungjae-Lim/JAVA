
public class BookTest {

	public static void main(String[] args) {
		
		
		Book[] books = new Book[5]; 
		books[0] = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
		books[1] = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
		books[2] = new Book("지금 알고 있는 걸 그때도 알았더라면","류시화", "열림원", "시집", 8100);
		books[3] = new Book("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);
		books[4] = new Book("여행의 이유", "김영하", "문학동네", "에세이", 12150);
		
		
		
		
		BookStore store1 = new BookStore(books);
		store1.bookManage();
	}

}
