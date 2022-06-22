import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		System.out.println(b1);

		System.out.println(b2);

		System.out.println(b3);
		
		System.out.println(set.size());
		
		System.out.println(set.toString());
		
		for(Object o : set) {
			System.out.println(o);
		}
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		set.get(0); set은 인덱스 번호를 가지고 있지않아서 get이라는 메소드 자체가 존재 하지 않는다.
	}
	
}
