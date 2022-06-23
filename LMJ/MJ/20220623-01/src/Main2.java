import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main2 {
	public static void main(String[] args) {	
		JFrame frame = new JFrame();
		frame.setTitle("제목 입니다.");
		
		frame.getContentPane().add(new JLabel("Hello World"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}
}