public class StudentTest{
	public static void main(String args[]){
		Student s1 = new  Student("나", 90, 80, 70);
		s1.setMath(94);
		System.out.println(s1.avg());
	}
}