import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InformationOutPut {
	public static void main(String[] args) {
		List<Information> list = new ArrayList<>(
				Arrays.asList(new Information(1, "홍길동", "011-111-1111", "hong@hanmail.net"),
						new Information(2, "김유신", "010-222-2222", "kim@hanmail.net")));

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("d:\\filetest\\information.ser"));
			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}
			oos.flush();
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
}
