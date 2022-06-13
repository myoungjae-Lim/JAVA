
public class Melon extends Food {
	private String place;

	public Melon(int kcal, int price, int weight, String place) {
		super(kcal, price, weight);
		this.place = place;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n농경지:" + place;
	}
}
