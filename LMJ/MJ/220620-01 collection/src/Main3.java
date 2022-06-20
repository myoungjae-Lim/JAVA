import java.util.List;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 위의 리스트에 10, 20, 30, 40 
		for(int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		
		// 모든 원소들을 출력해보세요
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.set(1, 10);
		System.out.println(list);
		
		System.out.println(list.contains(10));
		System.out.println(list.indexOf(30));
		
		list.remove(2);
		
		System.out.println(list);
		
		list.add(0, 3);
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list.isEmpty());
	}
}
