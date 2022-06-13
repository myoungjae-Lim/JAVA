
public class Student {
	private String name;
	private int number;
	private String major;
	private int grade;
	private int score;
	
	public Student(String name, int number, String major, int grade, int score) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "이름:" + name + "\n학번:" + number + "\n소속 학과:" + major + "\n학년:" + grade + "\n이수 학점 수:" + score;
	}
	
	
}
