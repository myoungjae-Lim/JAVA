
public class StudentTest {
	public static void main(String[] args) {
		UnderGraduate ug = new UnderGraduate("가나다", 20152243, "it", 4, 137, "볼링");
		Graduate g = new Graduate("고노도", 12345678, "체육", 4, 100, "교육 조교", 0.5);
		
		System.out.println(ug.toString());
		System.out.println();
		System.out.println(g.toString());
	}
}
