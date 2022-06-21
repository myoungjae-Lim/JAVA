import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		list.add("문자열4");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		
		System.out.println(list);
	}
}
