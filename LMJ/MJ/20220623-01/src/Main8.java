import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main8 extends JFrame {
	public Main8() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		
		JTextField tf1 = new JTextField(20);
		JTextField tf2 = new JTextField(20);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();
				tf2.setText(text);
				JOptionPane.showMessageDialog(Main8.this, text); // 익명클래스에서 this는 익명클래스 자기 자신을 가르킨다. 
			}
		});
		
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		add(pnlBox);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main8().setVisible(true);
	}
}
