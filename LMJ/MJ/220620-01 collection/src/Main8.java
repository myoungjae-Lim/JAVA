import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		
		System.out.println(list);
		// 합, 평균
		
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i < list.size();i++) {
			sum += list.get(i);
		}
		avg = sum / list.size();
		
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
		
		// 정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		
		if(list.contains(57)) {
			System.out.println(list.indexOf(57));
		}
		
		// 정수 23의 개수
		int count = 0;
		
		for(int i = 0; i < list.size();i++) {
			if(list.get(i) == 23) {
				count++;
			}
		}
		
		System.out.println(count);
		
		// 중복되는 원소 23을 '하나' 삭제하기
//		Iterator<Integer> iterator = list.iterator();
//		
//		while(true) {
//			if(iterator.hasNext()) {
//				if(iterator.next() == 23) {
//					iterator.remove();
//					break;
//				}
//			}
//		}
		
//		int index = list.lastIndexOf(23);
//		list.remove(index);
//		System.out.println(list);
		
		list.remove(Integer.valueOf(23));
		System.out.println(list);
		
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
	}
}
