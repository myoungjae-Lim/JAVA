import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {		
			String str = iterator.next();
			if(str.length() == 5) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
		
//		System.out.println(list.contains(new String("banana"))); // equals로 구현되고있다.
//		list.remove("banana");
//		
//		System.out.println(list);
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
		
//		for(String s: list) { foreach 문은 보는 용도 변경 하는 용도가 x
//			System.out.println(s);
//			if(s.length() == 5) {
//				list.remove(s);
//			}
//		} 		
//		
	}
}