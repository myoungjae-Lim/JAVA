
public class Magazine extends Book {
	private String date;

	public Magazine(String title, int pages, String author, String date) {
		super(title, pages, author);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {		
		return super.toString() + "\n발매일" + date;
	}
	
}
