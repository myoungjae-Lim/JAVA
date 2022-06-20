import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
				
		List<Integer> test = Arrays.asList(10, 20 ,30, 40, 50); // 원소 추가나 삭제가 안됨
		
		list.addAll(Arrays.asList(60, 70, 80));
		System.out.println(list);
	
		list.removeAll(Arrays.asList(30, 40, 50));
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10, 20)));
		
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
	}
}
