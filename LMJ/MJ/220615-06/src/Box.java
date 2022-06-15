
public class Box implements Comparable{
	private double volume = 0;

	public Box(double volume) {
		this.volume = volume;
	}
	
	@Override
	public int compareTo(Object o) {
		Box other = (Box) o;
		return (int) (this.volume - other.volume);
	}
	
	public static void main(String[] args) {
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		
		if(b1.compareTo(b2) > 0) {
			System.out.println("b1이 b2보다 더 크다");
		}
		else {
			System.out.println("b1가 b2와 같거나 작다.");
		}
	}
	
}
