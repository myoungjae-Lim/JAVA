class Circle{
	double radius;
	String color;
	
	public Circle(){
		
	}
	public Circle(double radius){
		this.radius = radius;
	}
	
	double getRadius(){
		return radius;
	}
	
	double getArea(){
		return 3.14 * radius * radius;
	}

}

class Cylinder extends Circle{
	double height;
	
	public Cylinder(){
		super();
	}
	
	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	double getHeight(){
		return height;
	}
	
	double getVolume(){
		return super.getArea() * height;
	}
	
	
}

public class TestCylinder{
	public static void main(String args[]){
		Cylinder obj1 = new Cylinder();
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		
		System.out.println(obj2.getHeight());
		System.out.println(obj2.getRadius());
		System.out.println(obj2.getVolume());
		System.out.println(obj2.getArea());
		
	}
}