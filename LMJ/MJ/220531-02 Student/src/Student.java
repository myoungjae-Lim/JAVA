// 학생

// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자
// getter / setter

// 자기 평균 점수를 알려줄 수 있음.

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// 점수 합
	public int getSum() {
		return kor + eng + math;
	}

	// 평균 점수 얻기
	public double getAvg() {
		return getSum() / 3.0;
	}
}