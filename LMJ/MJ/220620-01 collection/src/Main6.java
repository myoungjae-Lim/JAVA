import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		Collections.sort(list);
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: " + index);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.max(list);
		Collections.min(list);
		System.out.println(Collections.max(list));
		
		Collections.fill(list, 33);
		
		Collections.replaceAll(list, 33, 77);
		
		System.out.println(list);
		
//		list.clear();
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target);	 // 원본에 덮어쓰는것이라 target의 원소가 들어갈 만큼의 공간이 있어야만 사용 할 수 있다. 	
		System.out.println(list);
	}
}
