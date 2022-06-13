
public class Human {
	private String name;
	private int age;
	private String profession;
	
	public Human(String name, int age, String profession) {
		
		this.name = name;
		this.age = age;
		this.profession = profession;
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


	public String toString() {
		return "이름:" + name + "\n" + "나이:" + age;
	}


	public String getProfession() {
		return profession;
	}
	
//	public static void main(String[] args) {
//		Human h1 = new Human("춘향", 18);
//		Human h2 = new Human("몽룡", 21);
//		Human h3 = new Human("사또", 50);
//		
//		System.out.println(h1.toString());
//		System.out.println(h2.toString());
//		System.out.println(h3.toString());
//	}
	
}
