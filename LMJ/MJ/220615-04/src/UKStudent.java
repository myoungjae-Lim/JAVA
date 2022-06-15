
public class UKStudent extends Student implements Hello {

	public UKStudent(String name, int age) {
		super(name, age);
	}

	@Override
	public void hi() {
		System.out.println("Hello");		
	}

	
}
