class Person{
	String name;
	String address;
	String number;
	
	public Person(String name, String address, String number){
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setAddress(String address){
		this.address = address;
	}
	void setNumber(String number){
		this.number = number;
	}
		
	String getName(){
		return name;
	}
	String getAddress(){
		return address;
	}
	String getNumber(){
		return number;
	}
}

class Customer extends Person{
	int customerNumber;
	int mileage;
	
	public Customer(String name, String address, String number, int customerNumber, int mileage){
		super(name, address, number);
		this.customerNumber = customerNumber;
		this.mileage = mileage;
	}
	
	void setCustomerNumber(int customerNumber){
		this.customerNumber = customerNumber;
	}
	
	void setMileage(int mileage){
		this.mileage = mileage;
	}
	
	int getCustomerNumber(){
		return customerNumber;
	}
	
	int getMileage(){
		return mileage;
	}
	
}

public class TestCustomer{
	public static void main(String args[]){
		Customer customer = new Customer("가나다", "부산시", "010-1234-5678", 1, 800);
		System.out.println(customer.getName());
		System.out.println(customer.getAddress());
		System.out.println(customer.getNumber());
		System.out.println(customer.getCustomerNumber());
		System.out.println(customer.getMileage());
		
	}
}