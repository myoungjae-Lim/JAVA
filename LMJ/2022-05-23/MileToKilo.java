import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame(){
		
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마일을 킬로미터로 변환");
		JPanel allpanel = new JPanel();
		allpanel.setLayout(new BoxLayout(allpanel, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("거리를 마일 단위로 입력하시오");
		JTextField text = new JTextField(5);
		panel.add(label);
		panel.add(text);
		allpanel.add(panel);
		
		JButton button = new JButton("변환");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		allpanel.add(button);
		button.setBackground(Color.red);
		
		JTextField result = new JTextField(15);
		result.setAlignmentX(Component.CENTER_ALIGNMENT);
		JPanel p2 = new JPanel();
		result.setText("1 마일은 1.6 킬로미터 입니다.");
		result.setEditable(false);
		result.setBackground(Color.white);
		p2.add(result);
		allpanel.add(p2);
		add(allpanel);
		pack();
		setVisible(true);
	}
}

public class MileToKilo{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}