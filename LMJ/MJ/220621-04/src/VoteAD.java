import java.time.LocalDate;

public class VoteAD implements LeafletHandler {
	private LocalDate date;

	public VoteAD(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String give() {
		return "선거 날짜는:" + date.toString() + " 입니다.";
	}
}
