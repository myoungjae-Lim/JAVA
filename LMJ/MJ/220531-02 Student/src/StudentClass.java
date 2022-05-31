// 학급(반)
// 학생 1번 
// 학생 2번
// 학생 3번

// 3명의 학생의 이름을 콘솔에 출력할 수 있음.
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 평균점수가 가장 높은 학생을 알려줄 수 있음. => 동일 점수. 1 < 2 < 3 순으로

public class StudentClass {
	// Studenet타입 학생 3명 선언
	private Student student1;
	private Student student2;
	private Student student3;

	// 비교를 위한 max 값
	private double max = 0;

	// 학생을 학급에 넣어주는 생성자
	public StudentClass(Student student1, Student student2, Student student3) {
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}
	


	// 모든 학생 이름을 콘솔에 출력
	public void printStudent() {
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		System.out.println(student3.getName());
	}

	// 세학생의 평균의 합을 반환
	public double getAverageSum() {
		return student1.getAvg() + student2.getAvg() + student3.getAvg();
	}

	// 세학생의 총 평균을 반환
	public double getAllAvg() {
		return getAverageSum() / 3.0;
	}

	// 평균 점수가 1등인 학생의 이름을 반환
	public Student getRankOne() {
		max = (student1.getAvg() >= student2.getAvg()) ? student1.getAvg() : student2.getAvg();
		max = (max >= student3.getAvg()) ? max : student3.getAvg();

		if (max == student1.getAvg()) {
			return student1;
		} else if (max == student2.getAvg()) {
			return student2;
		} else {
			return student3;
		}
	}

}
