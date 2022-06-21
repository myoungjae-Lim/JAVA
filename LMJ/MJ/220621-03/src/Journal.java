
public class Journal {
	private String date;
	private String title;
	private String weather;
	private String contents;
	
	public Journal(String date, String title, String weather, String contents) {
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.contents = contents;
	}

	public Journal() {
	
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Journal))
			return false;
		Journal other = (Journal) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Journal [date=" + date + ", title=" + title + ", weather=" + weather + ", contents=" + contents + "]";
	}	
	
}
