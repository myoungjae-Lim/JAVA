import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main10 {
	static List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박", "멜론", "키위"));
	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {
		run();
	}

	// 과일 목록 보여주기
	public static void printAll() {
		System.out.println(list);
		System.out.println();
	}

	// 과일 주기(제일 앞에거부터 줌)
	public static void giveFruit() {
		Iterator<String> iterator = list.iterator();
		if (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str + "를 줄게요.");
			iterator.remove();
			System.out.println();
		}
		else {
			System.out.println("줄 과일이 없어요");
		}
	}

	// 재고 과일 추가하기
	public static void addFruit() {
		String str = scan.next();
		if (list.size() < 10) {
			list.add(str);
		}
		else {
			System.out.println("과일은 10개 까지만 담을수 있어요.");
		}
		System.out.println(list);
	}

	public static void run() {
		while (true) {
			System.out.println("1:과일 목록\n2:과일 받기\n3:과일 추가\n4:종료");
			int n = scan.nextInt();

			switch (n) {
			case 1:
				printAll();
				break;
			case 2:
				giveFruit();
				break;
			case 3:
				addFruit();
				break;
			case 4:
				return;
			default:
				break;
			}
		}
	}
}
