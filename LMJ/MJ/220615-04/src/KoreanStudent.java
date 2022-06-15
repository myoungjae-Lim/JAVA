
public class KoreanStudent extends Student implements Hello {

	public KoreanStudent(String name, int age) {
		super(name, age);
	}

	@Override
	public void hi() {
		System.out.println("안녕하세요.");
	}
	
}
