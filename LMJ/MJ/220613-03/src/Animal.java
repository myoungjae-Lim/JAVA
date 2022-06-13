
public class Animal {
	public void sound() {
		System.out.println("동물은 제각각의 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override  //Annotation
	public void sound() {
		System.out.println("멍멍");
	}
}

class  Cat extends Animal {
	
	public void sound() {
		System.out.println("야옹");
	}
}