import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mycounter2 extends JFrame implements ActionListener {
	private int number = 0;
	private JButton btn;
	private JButton btn2;
	private JLabel lbl;
	
	public Mycounter2() {
		super("카운터");

		JPanel pnl = new JPanel();
		lbl = new JLabel("0");
		btn = new JButton("증가");
		btn2 = new JButton("감소");

//		ActionListener aListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				if (e.getSource() == btn) {
//					number++;
//				} else {
//					number--;
//				}
//
//				lbl.setText(String.valueOf(number));
//			}
//		};

		btn.addActionListener(this);
		btn2.addActionListener(this);

		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Mycounter2().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			number++;
			lbl.setText(String.valueOf(number));
		} else {
			number--;
			lbl.setText(String.valueOf(number));
		}
	}
}
