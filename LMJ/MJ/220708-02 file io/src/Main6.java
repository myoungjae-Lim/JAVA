import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		// 파일 생성 (직접 손으로)
		// person.txt
		// 파일 정보를 한 줄씩 읽어서
		// 1. 콘솔 출력
		File person = new File("d:\\filetest\\persons.txt");
		List<Integer> ageList = new ArrayList<>();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(person));
			String infor;
			while ((infor = br.readLine()) != null) {
				String[] str = infor.split(",");
				ageList.add(Integer.valueOf(str[1]));
				System.out.println(infor);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// 2. 사람 평균 나이 구해서 출력.
		int sum = 0;
		
		for(int i = 0; i < ageList.size();i++) {
			sum += ageList.get(i);
		}
		
		System.out.println("평균 나이:" + (sum / ageList.size()));
	}
}