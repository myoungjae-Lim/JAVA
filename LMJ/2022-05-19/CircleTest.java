class Circle{
	double r;
	int cx;
	int cy;
	
	double area(){
		return 3.14*r*r; 
	}
	double getR(){
		return r;
	}
	void setR(double radius){
		r = radius;
	}
	double getCx(){
		return cx;
	}
	void setCx(int x){
		cx = x;
	}
	double getCy(){
		return cy;
	}
	void setCy(int y){
		cy = y;
	}
	
}

public class CircleTest{
	public static void main(String args[]){
		Circle circle = new Circle();
		circle.setCx(0);
		circle.setCy(0);
		circle.setR(4.0);
		System.out.println(circle.area());
	}
}