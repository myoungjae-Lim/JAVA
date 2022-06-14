
public class CarTest {

	public static void main(String[] args) {
		Car first = new Car("HMW520");
		Car second = new Car("HMW520");
		
		if(first.equals(second)) {
			System.out.println("동일한 종류의 차입니다.");
		}

	}

}
