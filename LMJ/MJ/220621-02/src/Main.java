import java.util.ArrayList;
import java.util.List;

class Point2D {
	private int x;
	private int y;	
	
	public Point2D(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + ", " + y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Point2D))
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}	
	
}

public class Main {
	
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		// 0, 0
		list.add(new Point2D(0, 0));
		// 5, 5
		list.add(new Point2D(5, 5));
		
		Point2D p = list.get(0);
		System.out.println(p);
		
		Point2D p2 = list.get(1);
		System.out.println(p2);
		
		// 리스트에 0, 0 좌표 객체가 있는지?
		System.out.println(list.contains(new Point2D(5, 5)));
		// 리스트에 0, 0 좌표 객체의 인덱스는?
		System.out.println(list.indexOf(new Point2D(5, 5)));
		
//		System.out.println(list.remove(new Point2D(5, 5)));
		System.out.println(list);
	}
}
