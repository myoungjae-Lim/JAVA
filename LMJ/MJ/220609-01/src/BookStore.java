import java.util.Arrays;
import java.util.Scanner;

public class BookStore {
	Scanner scan = new Scanner(System.in);
	private Book[] books;

	public BookStore(Book... books) {
		this.books = books;
	}

	// 입력 받는 메소드
	public Book inputBook(Book book) {
		System.out.print("책제목: ");
		String title = scan.nextLine();
		System.out.print("작가: ");
		String name = scan.nextLine();
		System.out.print("출판사: ");
		String publisher = scan.nextLine();
		System.out.print("분야: ");
		String genre = scan.nextLine();
		System.out.print("가격: ");
		int price = scan.nextInt();
		

		return new Book(title, name, publisher, genre, price);
	}

	// 책을 정렬 하는 메소드
	public void booksSort() {
		Book book;
		for (int i = 0; i < books.length - 1; i++) {
			for (int j = i + 1; j < books.length; j++) {
				if (books[i].getPrice() > books[j].getPrice()) {
					book = books[i];
					books[i] = books[j];
					books[j] = book;
				}
				else if(books[i].getPrice() == books[j].getPrice()) {
					if(books[i].getTitle().length() > books[i].getTitle().length()) {
						book = books[i];
						books[i] = books[j];
						books[j] = book;
					}
				}

			}
		}

	}

	// 현재 있는 책을 출력하는 메소드
	public void booksPrint() {
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].getTitle());
		}
		System.out.println();
	}

	// 원하는 분야의 책을 출력하는 메소드
	public void selectGenrePrint() {

		System.out.print("원하는 분야를 선택하세요: ");
		System.out.println();

		String s = scan.next();
		System.out.println("*" + s + " 분야" + "*");

		for (int i = 0; i < books.length; i++) {
			if (s.equals(books[i].getGenre())) {
				System.out.println(books[i].getTitle());
			}
		}
	}

	// 책의 세부사항 출력
	public void detailPrint() {
		System.out.print("세부 사항을 알고싶은 책을 입력해주세요: ");
		scan.nextLine();
		String s = scan.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (s.equals(books[i].getTitle())) {
				books[i].allPrint();
			}
		}
	}

	// 원하는 책을 수정
	public void retouchBook() {
		System.out.println("수정할 책을 입력해주세요: ");
		scan.nextLine();
		String s = scan.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (s.equals(books[i].getTitle())) {
				books[i] = inputBook(books[i]);
			}
		}
	}
	
	// 책을 추가 
	public void addBook() {
		scan.nextLine();
		boolean t = false;
		for(int i = 0; i < books.length;i++) {
			if(books[i].getTitle() == null) {
				books[i] = inputBook(books[i]);
				t = true;
			}
		}
		if(t == false) {
			books = Arrays.copyOf(books, books.length + 1);
			books[books.length - 1] = inputBook(books[books.length - 1]);
		}
	}
	
	// 책을 초기화
	public Book initBook(Book book) {
		book.setTitle(null);
		book.setName(null);
		book.setPublisher(null);
		book.setGenre(null);
		book.setPrice(0);
		
		return book;
	}
	
	// 같은 작가의 책을 출력
	public void samePrint() {
		System.out.print("작가의 이름을 입력하세요: ");
		String s = scan.next();
		for(int i = 0;i < books.length;i++) {
			if(s.equals(books[i].getName())) {
				System.out.println(books[i].getTitle());
			}
		}
		System.out.println();
	}
	
	// 책을 삭제
	public void removeBook() {
		System.out.println("삭제할 책 이름을 입력하세요: ");
		scan.nextLine();
		String s = scan.nextLine();
		for(int i = 0; i < books.length;i++) {
			if(books[i].getTitle().equals(s)) {
				books[i] = initBook(books[i]);
			}
		}
	}
	
	// 책에 관한 관리 시스템
	public void bookManage() {

		while (true) {
			System.out.print("1:책 출력\n2:원하는 분야 책 출력\n3:책 정렬\n4:세부 사항 보기\n5:수정\n6:추가\n7:삭제\n8:원하는 작가의 책\n9:종료\n");
			int n = scan.nextInt();
			System.out.println();
			switch (n) {
			case 1: // 출력
				booksPrint();
				System.out.println();
				break;
			case 2: // 원하는 분야 책 출력
				selectGenrePrint();
				System.out.println();
				break;
			case 3: // 책 정렬
				booksSort();
				System.out.println("정렬 되었습니다.");
				break;
			case 4: // 책 세부사항 출력
				detailPrint();
				break;
			case 5: // 책 수정
				retouchBook();
				System.out.println("수정 되었습니다.");
				break;
			case 6: // 책 추가
				addBook();
				System.out.println("추가 되었습니다.");
				break;
			case 7: // 책 삭제
				removeBook();
				System.out.println("삭제 되었습니다.");
				break;
			case 8: // 작가의 책
				samePrint();
				break;
			case 9: // 종료
				return;
			default: // 잘못된 입력 알려주기
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
}
