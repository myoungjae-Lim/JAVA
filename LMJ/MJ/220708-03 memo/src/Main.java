import java.io.File;

import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
//		chooser.showOpenDialog(null);
		int result = chooser.showSaveDialog(null);
		System.out.println(result);
		if(result == JFileChooser.APPROVE_OPTION) {
			System.out.println("저장 버튼을 눌렀을 떄");
			
			File file = chooser.getSelectedFile();
			System.out.println("사용자가 선택한 파일: " + file.getAbsolutePath());
		}
	}
}