import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("둘리", 100);
		map.put("홍길동", 100);
		map.put("도우너", 100);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "둘리");
		map2.put(4, "홍길동");
		map2.put(3, "도우너");
		
		System.out.println(map.toString());
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();		
		
		for(Entry e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
//		Set<String> keySet = map.keySet(); // 키값을 담고있는 메소드 
//		Iterator<String> iter = keySet.iterator();
//		
//		while (!iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//			
//			System.out.println(key + "=" + value);
//		}
//		
		
	}
}
