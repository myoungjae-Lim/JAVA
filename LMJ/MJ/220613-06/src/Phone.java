
public class Phone {
	private String producter;
	private String version;
	private String type;
	
	public Phone(String producter, String version, String type) {		
		this.producter = producter;
		this.version = version;
		this.type = type;
	}

	public String getProducter() {
		return producter;
	}

	public void setProducter(String producter) {
		this.producter = producter;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "제조사:" + producter + "\n버전:" + version + "\n통신타입:" + type;
	}
	
	
}
