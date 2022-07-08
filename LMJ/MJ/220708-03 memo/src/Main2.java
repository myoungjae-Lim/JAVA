import java.io.File;
import java.io.FileFilter;

import javax.swing.JFileChooser;

public class Main2 {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
		
		FileFilter filter = new FileFilter() {
			
			public String getDescription() {
				return "텍스트 파일";
			}
			@Override
			public boolean accept(File f) {
				if(f.isDirectory()) {
					return true;
				}
				return f.getName().endsWith(".txt");
			}
		};
		chooser.setFileFilter( (javax.swing.filechooser.FileFilter) filter);
	}
}
