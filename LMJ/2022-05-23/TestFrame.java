import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame(){
		
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();		
		JLabel label = new JLabel("자바는 재미있나요?");
		JButton b1 = new JButton("Yes");
		JButton b2 = new JButton("No");
		
		panel.add(label);
		panel.add(b1);
		panel.add(b2);
		add(panel);
		setVisible(true);
		
	}
}

public class TestFrame{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}