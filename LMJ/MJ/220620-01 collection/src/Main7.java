import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> twoList = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		System.out.println(twoList);
		
		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> sevenList = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
		System.out.println(sevenList);
		
		// 위의 리스트의 원소들을 모두 다 가지는 리스트 
		List<Integer> allList = new ArrayList<>(twoList);
		allList.addAll(sevenList);
		System.out.println(allList);
		
		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 
		List<Integer> colList = new ArrayList<>(allList);
		
		Collections.sort(colList);
		System.out.println(colList);
		Collections.reverse(colList);
		System.out.println(colList);
		
		// random 객체를 사용하여 0 ~ 10사이의 난수를 6개 가지는 리스트 
		
		List<Integer> r = new ArrayList<>();
		Random random = new Random();
		
		while(r.size() < 6) {
			int ran = random.nextInt(11);
			
			if(!r.contains(ran)) {
				r.add(ran);
			}
			
		}
		
		System.out.println(r);
		
	}
}