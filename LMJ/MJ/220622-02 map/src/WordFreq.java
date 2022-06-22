import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<>();
		
		String line = "Hello. I'm a java developer";
		line = line.replaceAll(" ","");
		
		for(int i = 0; i < line.length();i++) {
			char c = line.charAt(i);
			Integer freq = m.get(c);
			m.put(c, (freq == null) ? 1 : freq + 1);
		}
		
		System.out.println(m.size());
		System.out.println(m.containsKey('e'));
		System.out.println(m.isEmpty());
		System.out.println(m);
		
//		Map<String, Integer> m = new HashMap<>();
//		
//		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
//		for(String s : sample) {
//			Integer freq = m.get(s);
//			m.put(s, (freq == null) ? 1 : freq + 1);
//		}
//		
//		System.out.println(m.size());
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);
	}
}
