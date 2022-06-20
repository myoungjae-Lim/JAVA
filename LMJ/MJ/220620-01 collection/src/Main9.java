import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main9 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));
		
		// 위의 리스트에서 
		// 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성 
		List<String> fiveList = new ArrayList<>();
		
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).length() == 5) {
				fiveList.add(list.get(i));
			}
		}
		System.out.println(fiveList);
		
		// 문자열 중에 'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성 
		List<String> eList = new ArrayList<>();

		for(int i = 0; i < list.size();i++) {
			if(list.get(i).contains("e")) {
				eList.add(list.get(i));
			}
		}
		
		System.out.println(eList);
		
		//
		List<String> list2 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나", "100", "1000", "100번", "31일"));
		// 위의 2번 리스트에서 '숫자 형태의 값' 을 가지는 문자열을 찾아 
		// 정수형 리스트 생성 
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < list2.size();i++) {
			if(intTrue(list2.get(i))) {
				intList.add(Integer.valueOf(list2.get(i)));
			}
		}
		
		System.out.println(intList);
	
// 		예외 처리를 이용하는 방법		
//		List<Integer> listIntegers = new ArrayList<>(); 
//		
//		for(int i = 0; i < list2.size();i++) {
//			String str = list2.get(i);
//			
//			try {
//				Integer value = Integer.valueOf(str);
//				listIntegers.add(value);
//			} catch (NumberFormatException e) {
//				System.out.println("문자열을 정수형으로 변환하는데 실패하여 예외가 발생했으나 정상 흐름으로 돌아가기를 원해 예외 처리를 진행");
//			}
//		}
//		System.out.println(listIntegers);
		
	}
	
	// 문자열이 정수인지 판별하는 메소드
	public static boolean intTrue(String s) {
		int count = 0;
		
		for(int i = 0; i < s.length();i++) {
			int c = s.charAt(i) - '0';
			if(c >= 0 && c < 10) {
				count++;
			}
		}
		
		if(count == s.length()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}