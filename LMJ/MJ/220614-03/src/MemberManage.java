import java.util.Scanner;

public class MemberManage {
	private Member[] member = new Member[10];
	Scanner scan = new Scanner(System.in);

	public Member inputMember(Member member) {
		System.out.print("이름:");
		String name = scan.next();
		System.out.print("키:");
		double height = scan.nextDouble();
		System.out.print("몸무게:");
		double weight = scan.nextDouble();
		return new Member(name, height, weight);
	}

	public void sortMember() {
		Member member1;
		for (int i = 0; i < countMember() - 1; i++) {
			for (int j = i + 1; j < countMember(); j++) {
				if (member[i].getBmi() > member[j].getBmi()) {
					member1 = member[i];
					member[i] = member[j];
					member[j] = member1;
				}
			}
		}
	}

	public void statePrint() {
		String[] arr = { "저체중", "정상", "과체중", "경도 비만", "중도 비만", "고도 비만" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("========================");
			System.out.println("*" + arr[i] + "*");

			for (int j = 0; j < countMember(); j++) {
				if (member[j].getState().equals(arr[i])) {
					System.out.println(member[j].toString());

				}
			}
		}
	}

	public void registerMember() {
		System.out.print("등록할 회원 수를 입력하세요.");
		int n = scan.nextInt();
		if (n > 10) {
			System.out.println("회원 등록은 10명 까지만 가능합니다.");

		} else {
			for (int i = 0; i < n; i++) {
				Member member1 = inputMember(member[i]);
				if (i == 0) {
					member[i] = member1;
					System.out.println(i + 1 + "번째 회원");
				} else {
					for (int j = 0; j < i; j++) {
						if (member[j].equals(member1)) {
							System.out.println("이미 등록된 회원입니다.");
							i--;
							break;
						} 
						if (j == i - 1) {
							member[i] = member1;
							System.out.println("추가 되었습니다.");
							break;
						}
					}
				}
			}
		}
	}

	public void printMember() {
		for (Member m : member) {
			if (m != null) {
				System.out.println(m.toString());
			}
		}
	}

	public int countMember() {
		int count = 0;
		for (int i = 0; i < member.length; i++) {
			if (member[i] != null) {
				count++;
			}
		}
		return count;
	}

	public void plusMember() {
		System.out.print("추가할 회원 수를 입력하세요");
		int n = scan.nextInt();
		int count = countMember();
		if (n + countMember() > 10) {
			System.out.println("총 회원수는 10명 까지만 가능합니다.\n현재 회원수는" + countMember() + "입니다.");
		} else {
			for (int i = count; i < n + count; i++) {
				Member member1 = inputMember(member[i]);
				for (int j = 0; j < i; j++) {
					if (member[j].equals(member1)) {
						System.out.println("이미 등록된 회원입니다.");
						i--;
						break;
					}
					if (j == i - 1) {
						member[i] = member1;
						System.out.println("추가 되었습니다.");
						break;
					}
				}
			}
		}

	}

	public void manage() {
		while (true) {
			System.out.print("1:회원 등록\n2:회원 출력\n3:회원 추가\n4:회원 bmi 오름차순 정렬\n5:bmi 상태별 출력\n6:종료");
			System.out.println();
			int n = scan.nextInt();

			switch (n) {
			case 1:
				registerMember();
				break;
			case 2:
				printMember();
				break;
			case 3:
				plusMember();
				break;
			case 4:
				sortMember();
				break;
			case 5:
				statePrint();
				break;
			case 6:
				return;
			default:
				break;
			}
		}
	}

}
