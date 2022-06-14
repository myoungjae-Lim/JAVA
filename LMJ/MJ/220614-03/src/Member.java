
public class Member {
	private String name;
	private double height;
	private double weight;
	private String state;
	
	

	public Member(String name, double height, double weight) {		
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.state = selectState(getBmi());
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getBmi() {
		return weight/ (height * height);
	}

	public String selectState(double bmi) {
		if(bmi >= 35) {
			return "고도 비만";
		} 
		else if(bmi >= 30) {
			return "중도 비만";
		} 
		else if(bmi >= 25) {
			return "경도 비만";
		} 
		else if(bmi >= 23) {
			return "과체중";
		} 
		else if(bmi >= 18.5) {
			return "정상";
		}
		else {
			return "저체중";
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Member))
			return false;
		Member other = (Member) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "이름:" + name + " 키:" + height + " 몸무게:" + weight + " 현재 상태:" + state;
	}
	
}
