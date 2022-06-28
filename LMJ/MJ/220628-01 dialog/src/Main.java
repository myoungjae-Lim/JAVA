import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SubWindow extends JDialog {
	private JTextField tf;

	public SubWindow(JFrame owner) {
		super(owner, true);

		setTitle("부가 창");

		tf = new JTextField(10);
		add(tf, "North");
		
		System.out.println(getOwner());

		JButton btn = new JButton("다른 버튼");
		add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		setSize(500, 500);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
	
	public String showDialog() {
		setVisible(true);
		return tf.getText();
	}
}

public class Main extends JFrame {
	public Main() {
		super("주요 창");

		JButton btn = new JButton("버튼");
		add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SubWindow dialog = new SubWindow(Main.this);
				String result = dialog.showDialog();
				System.out.println("이 문장은 언제 호출 될까?");
				
				btn.setText(result);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
