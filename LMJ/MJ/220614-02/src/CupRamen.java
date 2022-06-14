// 컵라면
// 제조사
// 이름
// 가격

// 생성자, 게터 세터

// override
// toString
// equals - 제조사와 이름이 같으면 

public class CupRamen {
	private String company;
	private String name;
	private int price;
	
	public CupRamen(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "제조사:" + company + "\n이름:" + name + "\n가격:" + price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CupRamen)) {
			return false;
		}
		CupRamen other = (CupRamen) obj;
		if (company == null) {
			if (other.company != null) {
				return false;
			}
		} else if (!company.equals(other.company)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	

	
	
	
}
