class Circles{
	private double radius;
	static final double PI = 3.141592;
	
	public Circles(double radius){
		this.radius = radius;
	}
	
	void setRadius(double r){
		radius = r;
	}
	double getRadius(){
		return radius;
	}
	private double square(){
		return radius * radius;		
	}
	
	static double getPI(){
		return PI;
	}
	
	double getArea(){
		return square();
	}
	
	double getPerimeter(){
		return 2 * PI * radius;
	}
}

public class CirclesTest{
	public static void main(String args[]){
		Circles circle = new Circles(5.0);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
	}
	
}