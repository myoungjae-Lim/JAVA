/*
 * restaurants 테이블에 대한 db access를 수행하는 객체를 작성해보세요
 * 
 * 메소드(입력값) : 반환값				throws 예외
 * 
 * C(상호명, 전화번호, 주소) or C(음식점) : 행 개수
 * R() : List<음식점>
 * R(id) : 음식점
 * U(id, 상호명, 전화번호, 주소) or U(음식점) : 행 개수 
 * D(id) : 행 개수 
 * 
 * ---------------------------------------------------
 * 
 * 여러 행의 음식점 추가 
 */
public class Restaurants {
	private int id;
	private String name;
	private String callNumber;
	private String address;

	public Restaurants(int id, String name, String callNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.callNumber = callNumber;
		this.address = address;
	}

	

	public Restaurants(String name, String callNumber, String address) {
		super();
		this.name = name;
		this.callNumber = callNumber;
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurants [id=" + id + ", name=" + name + ", callNumber=" + callNumber + ", address=" + address + "]";
	}

}
