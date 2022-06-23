import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame {
	private int number = 0;

	public MyCounter() {
		super("카운터");

		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("증가");
		JButton btntwo = new JButton("2배 증가");
		JButton btn2 = new JButton("감소");

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("왼쪽 레이블 숫자 바꿀 예정");
				number++;
				lbl.setText(String.valueOf(number));

			}
		});

		btntwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number *= 2;
				lbl.setText(String.valueOf(number));

			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number));

			}
		});

		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btntwo);
		pnl.add(btn2);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}
}
