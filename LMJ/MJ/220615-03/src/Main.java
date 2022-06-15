
public class Main {
	public static void main(String[] args) {
		Eagle e = new Eagle();
		Bird b = e;
		Animal a = e;
		Flyable f = e;
		
		f.fly();
		
		Flyable fish = new FlyingFish();
		fish.fly();
	}
}
