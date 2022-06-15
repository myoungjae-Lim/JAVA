// 도형
// x좌표
// y좌표

// 넓이 구할 수 있음.
public abstract class Shape { // 추상 메소드는 추상 클래스에만 존재 가능 
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract int getArea(); // 추상 메소드 ,abstract 메소드 - 동작에 대한 구체적X, 메소드 header 만 존재 
	
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
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	
		
}
