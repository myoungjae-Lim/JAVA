import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) { // set은 추가한 순서를 신경쓰지않는다. 인덱스도 x
			System.out.println(iter.next()); 
		}
		
		System.out.println(set.contains("banana"));
		System.out.println(set.contains("donut"));
	}
}
