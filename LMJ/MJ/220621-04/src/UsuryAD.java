
public class UsuryAD implements LeafletHandler {
	private String phoneNumber;

	public UsuryAD(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String give() {
		return "떼인돈 받아드립니다. " + phoneNumber;
	}
	
	
}
