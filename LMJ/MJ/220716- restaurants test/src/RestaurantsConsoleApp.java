import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.MidiDevice.Info;

public class RestaurantsConsoleApp {
	private RestaurantsRepository repo = new RestaurantsRepository();

	public static void main(String[] args) {
		RestaurantsConsoleApp app = new RestaurantsConsoleApp();
		app.info();
	}

	public void info() {
		System.out.println("1. 추가, 2. 목록, 3. 삭제, 4. 수정, 5. 검색(제목)");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		switch (num) {
		case 1:
			add();
			break;
		case 2:
			list();
			break;
		case 3:
			delete();
			break;
		case 4:
			update();
			break;
		case 5:
			search();
			break;
		default:
			break;
		}
	}

	private void add() {
		System.out.println("가게이름, 전화번호, 주소를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String callNumber = scan.nextLine();
		String address = scan.nextLine();

		try {
			int result = repo.add(new Restaurants(name, callNumber, address));
			if (result > 0) {
				System.out.println(result + "행이 추가 되었습니다.");
			} else {
				System.out.println("행 추가 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void list() {
		try {
			List<Restaurants> list = repo.list();

			if (list.size() > 0) {
				for (Restaurants r : list) {
					System.out.println(r);
				}
			} else {
				System.out.println("등록된 가게가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터 불러오기 실패");
		}

	}

	private void delete() {
		System.out.println("제거할 가게의 id를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		
		try {
			int result = repo.delete(id);
			if(result > 0) {
				System.out.println(result + "행이 삭제되었습니다.");
			} else {
				System.out.println("없는 가게 입니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터 삭제에 실패 했습니다.");
		}
		
	}

	private void update() {
		System.out.println("수정할 가게의 id, 가게명, 전화번호, 주소 순 입력");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		scan.nextLine();
		String name = scan.nextLine();
		String callNumber = scan.nextLine();
		String address = scan.nextLine();

		try {
			int result = repo.update(new Restaurants(id, name, callNumber, address));
			if(result > 0) {
				System.out.println(result + "행이 수정되었습니다.");
			} 
		} catch (SQLException e) {
			System.out.println("데이터 수정에 실패 했습니다.");
		}
	}

	private void search() {
		System.out.println("id를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();

		try {
			Restaurants restaurants = repo.search(id);
			System.out.println(restaurants);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
