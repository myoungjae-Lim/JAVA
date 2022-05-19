class Rectangle{
	int w;
	int h;
	int getArea(){
		return w*h;
	}
	
	int getPrimeter(){
		return (w+h)*2;
	}
}

public class RectangleTest{
	public static void main(String args[]){
		Rectangle box = new Rectangle();
		box.w = 5;
		box.h = 5;
		int area = box.getArea();
		int primeter = box.getPrimeter();
		System.out.println("넓이는 : " + area);
		System.out.println("둘레는 : " + primeter);
		
	}
}