class Point{
	private int x, y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}

class Circle{
	private int radius = 0;
	private Point center;
	
	public Circle(Point p, int r){
		center = p;
		radius = r;
	}
	
	// 중심점 getter 
	public Point getPoint(){
		return center;
	}
	
	public void setPoint(Point center){
		this.center = center;
	}
	
}
public class CircleTest{
	public static void main(String args[]){
		
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(p);
		System.out.println(c.getPoint());
	}
}