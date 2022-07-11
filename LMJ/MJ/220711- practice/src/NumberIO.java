import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberIO {
	public static void main(String[] args) {
		BufferedReader br = null;
		List<Double> list = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader("d:\\filetest\\number.txt"));
			String line;
			while((line = br.readLine()) != null) {
				list.add(Double.valueOf(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("파일 끝");
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
		
		Collections.sort(list);
		System.out.println(list);

	}
}
