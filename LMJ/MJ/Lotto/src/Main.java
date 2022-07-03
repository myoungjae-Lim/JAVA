import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame {
	Consumer c = new Consumer();
	private int x;
	private JTextField tf;
	private JButton btn;
	
	public Main() {
		
		JPanel pnl = new JPanel();
		tf = new JTextField(10);
		btn = new JButton("1");
		
		PurchaseCheckBox p = new PurchaseCheckBox();
		
		
		pnl.add(tf);
		pnl.add(btn);
		add(pnl);
		tf.setText("가");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText());
				p.setVisible(true);
				c = p.getConsumer();
				System.out.println(c.getList());
			}
		});
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
