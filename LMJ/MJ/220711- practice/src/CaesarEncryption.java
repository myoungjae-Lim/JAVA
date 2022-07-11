import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CaesarEncryption {
	public static void main(String[] args) {
		BufferedReader br = null;
		List<String> list = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader("d:\\filetest\\decryption.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(list);

		List<String> epList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			String str = "";
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == ' ') {

				} else {
					c = (char) Character.toUpperCase(s.charAt(j) + 3);
					if (c > 'Z') {
						c -= 26;
					}
					c = Character.toUpperCase(c);
				}
				str += c;
			}
			epList.add(str);
		}
		System.out.println(epList);

		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter("d:\\filetest\\encryption.txt"));

			for (int i = 0; i < epList.size(); i++) {

				pw.println(epList.get(i));
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}
}
