class Plane{
	private String producer;
	private String model;
	private int person;
	static int planes = 0;
	void setProducer(String pro){
		producer = pro;
	}
	String getProducer(){
		return producer;
	}
	void setModel(String md){
		model = md;
	}
	String getModel(){
		return model;
	}
	void setPerson(int p){
		person = p;
	}
	int getPerson(){
		return person;
	}
	
	public Plane(){
		planes++;
	}
	public Plane(String producer, String model, int person){
		this.producer = producer;
		this.model = model;
		this.person = person;
		planes++;
	}
	public Plane(String producer, String model){
		this.producer =producer;
		this.model =model;
		planes++;
	}
	public Plane(String model, int person){
		this.model = model;
		this.person = person;
		planes++;
	}
	
	int getPlanes(){
		return planes;
	}
	
}

public class PlaneTest{
	public static void main(String args[]){
		Plane p1 = new Plane();
		Plane p2 = new Plane("에어비스", "A380", 500);
		Plane p3 = new Plane("A380", 500);
		System.out.println(p1.getPlanes());
	}
}