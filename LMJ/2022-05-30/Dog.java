// 강아지 dog 클래스 
// name: 이름
// breed: 종
// age: 나이

// 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는 
// 생성자

// 강아지 이름, 종을 전달받은 값으로 초기화하고
// 나이는 1살로 초기화 할 수 있는 생성자

// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
// 각 필드의 public 한 getter/setter를 작성해보세요

public class Dog{
	private String name;
	private String breed;
	private int age;
	
	public Dog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog(String name, String breed){
		this(name, breed, 1);
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	
	
	
}