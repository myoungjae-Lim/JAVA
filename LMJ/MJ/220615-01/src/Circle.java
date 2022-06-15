
public class Circle extends Shape {
	private int radius;
	private final double PI = 3.14;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return (int)PI * radius * radius;
	}
	
	
	
}
