import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	
	private JButton btnNotShown;
	private JButton[] btn = new JButton[5];
	private JButton btnEnable;
	private JButton btnDisable;
//	private List<JButton> list;
	
	public Main4() {
		super("버튼 활성화 테스트");

		JPanel pnl = new JPanel();

		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		btnNotShown = new JButton("보이나??");

		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);

//		btnDisable.setEnabled(false);
		btnNotShown.setVisible(false);

		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(String.valueOf(i + 1));
			btn[i].setEnabled(false);
			pnl.add(btn[i]);
		}

		add(pnl);

		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			for (int i = 0; i < btn.length; i++) {
				btn[i].setEnabled(true);
			}
		} else {
			for (int i = 0; i < btn.length; i++) {
				btn[i].setEnabled(false);
			}
		}
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
