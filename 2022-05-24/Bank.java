import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame(){
		
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panelA = new JPanel();
		panelA.setLayout(new FlowLayout());
		JLabel labelA = new JLabel("원금을 입력하시오");
		JTextField textA = new JTextField(5);
		panelA.add(labelA);
		panelA.add(textA);
		
		JPanel panelB = new JPanel();
		panelB.setLayout(new FlowLayout());
		JLabel labelB = new JLabel("이율을 입력하시오");
		JTextField textB = new JTextField(5);
		panelB.add(labelB);
		panelB.add(textB);
		
		JButton button = new JButton("변환");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		JPanel panelC = new JPanel();
		JTextField textc = new JTextField("이자는 연 75만원 입니다.");
		panelC.add(textc);
		
		
		panel.add(panelA);
		panel.add(panelB);
		panel.add(button);
		panel.add(panelC);
		add(panel);
		pack();
		
		setVisible(true);
		
		
	}
}

public class Bank{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}