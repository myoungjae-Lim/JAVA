class Box{
	//필드 정의
	int width;
	int height;
	int length;
	//메소드 정의
	int getWidth(){
		return width;
	}
	void setWidth(int amount){
		width = amount;
	}
	int getHeight(){
		return height;
	}
	void setHeight(int amount){
		height = amount;
	}
	int getLength(){
		return length;
	}
	void setLength(int amount){
		length = amount;
	}
	int getVolume(){
		return width * length * height;
	}
}

public class BoxTest{
	public static void main(String args[]){
		Box box1 = new Box();
		box1.setHeight(100);
		box1.setLength(100);
		box1.setWidth(100);
		
		System.out.println(box1.getVolume());
		
		Box box2 = new Box();
		box2.setHeight(200);
		box2.setLength(200);
		box2.setWidth(200);
		
		box1 = box2;
		
		System.out.println(box1.getHeight());
		System.out.println(box1.getLength());
		System.out.println(box1.getWidth());
	}
}