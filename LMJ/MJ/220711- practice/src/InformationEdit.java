import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InformationEdit {
	private static ObjectInputStream ois;
	private static List<Information> list;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ois = null;
		list = new ArrayList<>();

		try {
			ois = new ObjectInputStream(new FileInputStream("d:\\filetest\\information.ser"));
			Information infor;
			while ((infor = (Information) ois.readObject()) != null) {
				list.add(infor);
			}
		} catch (EOFException e) {
			System.out.println("파일 끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(list);

		run();

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("d:\\filetest\\information.ser"));

			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

	public static void run() {
		boolean t = true;
		while (t) {
			System.out.println("1:정보 보기\n2:삭제\n3:수정\n4:종료");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				System.out.println(list);
				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {
					System.out.println("번호: " + list.get(i).getNumber());
				}
				System.out.print("삭제할 번호 선택");
				int a = scan.nextInt() - 1;
				if (a + 1 > list.size()) {
					System.out.println("번호 없음");
					break;
				}
				list.remove(a);
				System.out.println(a + "번 삭제 완료");
				break;
			case 3:
				for (int i = 0; i < list.size(); i++) {
					System.out.println("번호: " + list.get(i).getNumber());
				}
				System.out.print("수정할 번호 선택");
				a = scan.nextInt() - 1;
				if ( list.get(a) == null) {
					System.out.println("번호 없음");
					break;
				}
				System.out.println(list.get(a));

				System.out.print("name: ");
				String name = scan.next();
				System.out.println("phoneNumber: ");
				String phoneNumber = scan.next();
				System.out.println("email: ");
				String email = scan.next();

				list.get(a).setName(name);
				list.get(a).setPhoneNumber(phoneNumber);
				list.get(a).setEmail(email);
				System.out.println("수정 완료");
				break;
			case 4:
				t = false;
				break;
			default:
				break;
			}
		}
	}
}
