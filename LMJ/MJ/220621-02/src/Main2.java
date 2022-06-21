import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int score;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return score - o.score;		
	}

}

public class Main2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		list.add(new Student("홍길동", 15, 90));
		list.add(new Student("둘리", 22, 80));
		list.add(new Student("도우너", 33, 95));

		System.out.println(list.indexOf(new Student("도우너", 33, 0)));
		
		Collections.sort(list);
		System.out.println(list);
		
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
						
		};
		
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
