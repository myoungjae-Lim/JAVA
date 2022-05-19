class Dog{
	public String name;
	public String breed;
	public int age;
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void initDog(String name, String breed, int age){
		name = null;
		breed = null;
		age = 0;
	}
}