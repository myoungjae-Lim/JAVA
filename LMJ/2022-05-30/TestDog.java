public class TestDog{
	public static void main(String args[]){
		Dog dog1 = new  Dog("백구", "진돗개", 1);
		Dog dog2 = new  Dog("황구", "시고르자브종");
		
		dog1.setName("멍멍");
		dog1.setBreed("진돗개");
		dog1.setAge(1);
		
		System.out.println(dog2.getAge());
	}
}