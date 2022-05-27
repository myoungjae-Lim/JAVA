public class TestBox{
	public static void main(String args[]){
		
		Box none = null;
		
		Box box1;
		box1 = new Box();
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		int volume = box1.volume();
		
		Box box2 = new Box();
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
	
		box2.printAllState();
		box1.printAllState();
		System.out.println(volume);
	}
}