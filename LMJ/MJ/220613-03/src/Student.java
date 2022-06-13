
public class Student extends Human {

	private String major;

	public Student(String name, int age, String major, String profession) {
		super(name, age, profession);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {		
		return super.toString() + "\n전공:" + major;
	}
	
	@Override
	public String getProfession() {
		return "학생";
	}
	
	public static void main(String[] args) {
		Student s = new Student("명진", 21, "컴퓨터", "개발자");
		System.out.println(s.toString());
	}

}
