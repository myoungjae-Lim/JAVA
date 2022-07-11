import java.io.Serializable;

public class Information implements Serializable {
	private int number;
	private String name;
	private String phoneNumber;
	private String email;

	public Information(int number, String name, String phoneNumber, String email) {
		super();
		this.number = number;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Information [number=" + number + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}
	
	

}
