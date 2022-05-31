public class StudentTest {
	public static void main(String[] args) {

		Student student1 = new Student("또치", 60, 70, 80);
		Student student2 = new Student("둘리", 60, 90, 80);
		Student student3 = new Student("도우너", 60, 70, 80);

		StudentClass one = new StudentClass(student1, student2, student3);
		one.printStudent();

		double avg = one.getAllAvg();

		System.out.println(avg);
		System.out.println(one.getRankOne().getName());
		
	}
}
