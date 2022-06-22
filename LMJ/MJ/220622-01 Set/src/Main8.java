import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
	private String title;
	private int price;

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}

}

public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책1", 5000);
		Book b3 = new Book("책3", 7000);
		Book b4 = new Book("책2", 4000);
		
		Set<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		tree.add(b4);
		
		System.out.println(tree);
		
		Comparator<Book> com = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		Set<Book> treeByprice = new TreeSet<>(com);
		
		treeByprice.add(b1);
		treeByprice.add(b4);
		treeByprice.add(b3);
		treeByprice.add(b2);
		
		System.out.println(treeByprice);
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//
//		Set<Book> set = new HashSet<>(); // Hash라는 숫자값으로 따로 저장해놓기 때문에 Hash값으로 같은 object인지 비교를 한다. Hash로 비교해서 같다면 그다음으로
//										 // equals를 사용해서 비교를 한다.
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//
//		System.out.println(set.size());
//		System.out.println(set);

	}
}
