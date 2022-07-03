import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main2 extends Main{
	public Main2() {
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel();
		JTextField tf = new JTextField("고맙다");
		JButton btn = new JButton("눌러");
		
		pnl.add(lbl);
		pnl.add(btn);
		add(pnl);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				setX(5);
//				setTf("좀 되라");
//				System.out.println(getTf().getText());
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
