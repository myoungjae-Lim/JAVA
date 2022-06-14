public class RamenTest {
	public static void main(String[] args) {
		CupRamen r1 = new CupRamen("농심", "육개장", 1500);
		CupRamen r2 = new CupRamen("농심", "육개장", 2000);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.toString());
	}
}