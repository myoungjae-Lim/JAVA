import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InformationInPut {
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
		System.out.println("번호 입력");
		int n = scan.nextInt() - 1;
		System.out.println(list.get(n).getPhoneNumber());
		
	}

}
