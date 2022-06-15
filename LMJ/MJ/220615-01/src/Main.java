// 삼각형
// 중심점(x, y)
// 밑변
// 높이

// 넓이를 구해서 알려줄수 있음

// 직사각형
// 중심점
// 가로
// 세로

// 넓이를 구해서 알려줄 수 있음

// 원
// 중심점
// 반지름

// 넓이를 구해서 알려줄 수 있음.

public class Main {
	public static void main(String[] args) {
		Triangle t = new Triangle(0, 0, 5, 5);
		System.out.println(t.getArea());
		
		Shape s = t;
		System.out.println(s);
		
		Shape r = new Rectangle(0, 0, 10, 10);
		System.out.println(r.getArea());
		
		Shape c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
		
	}
}
