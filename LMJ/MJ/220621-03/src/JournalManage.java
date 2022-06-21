import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JournalManage {
	private static List<Journal> list = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	static Comparator<Journal> dateComparator = new Comparator<Journal>() {

		@Override
		public int compare(Journal o1, Journal o2) {
			int[] date1 = dateSeparate(o1);
			int[] date2 = dateSeparate(o2);

			if (date1[0] == date2[0]) {
				if (date1[1] == date2[1]) {
					return date1[2] - date2[2];
				} else {
					return date1[1] - date2[1];
				}
			} else {
				return date1[0] - date2[0];
			}
		}
	};

	public static boolean numTrue(char c) {
		int n = c - '0';
		if (n >= 0 && n < 10) {
			return true;
		} else {
			return false;
		}
	}

	public static Journal registerJournal() {
		System.out.println("날짜(yyyy-mm-dd), 제목, 날씨, 내용 순으로 입력해주세요.");
		String date = scan.next();
		if (!numTrue(date.charAt(0))) {
			System.out.println("날짜를 다시 입력하세요.(yyyy-mm-dd 형식)");
			date = scan.next();
		}
		String title = scan.next();
		String weather = scan.next();
		scan.nextLine();
		String contents = scan.nextLine();

		return new Journal(date, title, weather, contents);
	}

	public static void addJournal() {
		Journal journal = registerJournal();
		if (list.contains(journal)) {
			System.out.println("같은날짜의 일기는 등록 할수 없습니다.");
		} else {
			list.add(journal);
		}
	}

	// 날짜 분리
	public static int[] dateSeparate(Journal journal) {
		String[] arr = journal.getDate().split("-");
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = Integer.valueOf(arr[i]);
		}

		return arr1;
	}

	// 날짜순
	public static void printDatesJournal() {
		Collections.sort(list, dateComparator);

		for (Journal j : list) {
			System.out.println(j);
		}
	}

	// 내용 길이순
	public static void printContentsLengthJournal() {
		Collections.sort(list, new Comparator<Journal>() {
			@Override
			public int compare(Journal o1, Journal o2) {
				if (o1.getContents().length() == o2.getContents().length()) {
					return o1.getTitle().compareTo(o2.getTitle());
				} else {
					return o1.getContents().length() - o2.getContents().length();
				}
			}
		});

		for (Journal j : list) {
			System.out.println(j);
		}
	}

	// 일기 내용 수정
	public static void retouchContents(Journal journal) {
		journal.setDate(journal.getDate());
		journal.setTitle(journal.getTitle());
		journal.setWeather(journal.getWeather());
		System.out.println("새로운 내용 입력하세요");
		journal.setContents(scan.next());
	}

	public static void retouchJournal() {
		System.out.println("선택 가능한 날짜");
		for (Journal j : list) {
			System.out.print(j.getDate() + "/");
		}
		
		System.out.println();
		System.out.println("날짜 선택");
		String date = "";
		try {
			date = scan.next();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("날짜 형식을 지켜주세요");
		}
		
		int index = list.indexOf(new Journal(date, "", "", ""));

		retouchContents(list.get(index));

	}

	// 일기 삭제
	public static void removeJournal() {
		Collections.sort(list, dateComparator);
		list.remove(0);
	}

	public static void run() {
		while (true) {
			System.out.println("1:일기 등록  2:날짜순  3:내용 길이순  4:일기 수정  5:일기 삭제  6:종료");
			int n = scan.nextInt();

			switch (n) {
			case 1:
				addJournal();
				break;
			case 2:
				printDatesJournal();
				break;
			case 3:
				printContentsLengthJournal();
				break;
			case 4:
				retouchJournal();
				break;
			case 5:
				removeJournal();
				break;
			case 6:
				return;
			default:
				break;
			}
		}

	}

}
