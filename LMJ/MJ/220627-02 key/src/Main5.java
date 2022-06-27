import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Main5 extends JFrame {
	private Map<String, String> map = new HashMap<>();

	public Main5() {
		super("로그인");
		CardLayout layout = new CardLayout();
		JPanel pnl = new JPanel(layout);
		JPanel loginPnl = new JPanel();
		JPanel signPnl = new JPanel();
		JPanel resultPnl = new JPanel();

		pnl.add(loginPnl, "Login");
		pnl.add(signPnl, "Sign");
		pnl.add(resultPnl, "Result");

		JButton initBtn2 = new JButton("처음 화면");
		JLabel resultLbl = new JLabel("로그인 성공");
		initBtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(pnl, "Login");
			}
		});
		
		resultPnl.add(resultLbl);
		resultPnl.add(initBtn2);

		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);
		JButton loginBtn = new JButton("로그인");
		JButton signBtn = new JButton("가입");

		SpringLayout sl_loginPnl = new SpringLayout();
		sl_loginPnl.putConstraint(SpringLayout.NORTH, signBtn, -1, SpringLayout.NORTH, pf);
		sl_loginPnl.putConstraint(SpringLayout.WEST, signBtn, 0, SpringLayout.WEST, loginBtn);
		sl_loginPnl.putConstraint(SpringLayout.EAST, signBtn, 0, SpringLayout.EAST, loginBtn);
		sl_loginPnl.putConstraint(SpringLayout.NORTH, loginBtn, -1, SpringLayout.NORTH, tf);
		sl_loginPnl.putConstraint(SpringLayout.WEST, loginBtn, 37, SpringLayout.EAST, tf);
		sl_loginPnl.putConstraint(SpringLayout.NORTH, pf, 31, SpringLayout.SOUTH, tf);
		sl_loginPnl.putConstraint(SpringLayout.WEST, pf, 55, SpringLayout.WEST, loginPnl);
		sl_loginPnl.putConstraint(SpringLayout.NORTH, tf, 23, SpringLayout.NORTH, loginPnl);
		sl_loginPnl.putConstraint(SpringLayout.EAST, tf, 0, SpringLayout.EAST, pf);
		loginPnl.setLayout(sl_loginPnl);

		loginPnl.add(tf);
		loginPnl.add(pf);
		loginPnl.add(loginBtn);
		loginPnl.add(signBtn);

		loginBtn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
				System.out.println(pf.getText());
				if (map.containsKey(tf.getText()) && map.containsValue(pf.getText())) {
					layout.show(pnl, "Result");
				} else if (map.containsKey(tf.getText())) {
					JOptionPane.showMessageDialog(pnl, "비밀번호 틀림");
					pf.setText("");
				} else {
					JOptionPane.showMessageDialog(pnl, "없는 아이디");
					tf.setText("");
					pf.setText("");
				}
			}
		});

		signBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(pnl, "Sign");
			}
		});

		JLabel idLbl = new JLabel("아이디 (4자 이상 ~ 12 이하)");
		JLabel confirmID = new JLabel("아이디 확인");
		JTextField inputID = new JTextField(10);
		JLabel pwLbl = new JLabel("비밀번호");
		JPasswordField inputPW = new JPasswordField(10);
		JLabel pwCLbl = new JLabel("비밀번호 입력");
		JPasswordField inputPWC = new JPasswordField(10);
		JButton initPageBtn = new JButton("처음 화면");
		JButton confirmBtn = new JButton("확인");

		signPnl.add(initPageBtn);
		signPnl.add(confirmBtn);
		signPnl.add(inputID);
		signPnl.add(inputPW);
		signPnl.add(inputPWC);
		signPnl.add(idLbl);
		signPnl.add(pwLbl);
		signPnl.add(pwCLbl);
		signPnl.add(confirmID);

		inputID.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				int len = inputID.getText().length();
				if (map.containsKey(inputID.getText())) {
					confirmID.setText("이미 존재하는 아이디 입니다.");
				} else if (len < 4 || len > 12) {
					confirmID.setText("아이디는 4자 이상 12자 이하여야 합니다.");
				} else {
					confirmID.setText("사용 가능한 아이디 입니다.");
				}
				System.out.println(len);
			}
		});

		confirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int len = inputID.getText().length();
				if (len >= 4 && len <= 12) {
					if (!map.containsKey(inputID.getText())) {
						if (inputPW.getText().equals(inputPWC.getText())) {
							map.put(inputID.getText(), inputPW.getText());
							inputID.setText("");
							inputPW.setText("");
							inputPWC.setText("");
							
							JOptionPane.showMessageDialog(pnl, "회원 가입 완료 되었습니다.");
							System.out.println(map);
							layout.show(pnl, "Login");
						} else {
							JOptionPane.showMessageDialog(pnl, "비밀번호가 동일하지 않습니다.");

						}
					} else {
						JOptionPane.showMessageDialog(pnl, "이미 존재하는 아이디입니다.");
					}
				} else {
					JOptionPane.showMessageDialog(pnl, "아이디 길이 확인해주세요");
				}
			}
		});

		SpringLayout sl_signPnl = new SpringLayout();
		sl_signPnl.putConstraint(SpringLayout.NORTH, confirmID, 3, SpringLayout.NORTH, inputID);
		sl_signPnl.putConstraint(SpringLayout.WEST, confirmID, 23, SpringLayout.EAST, inputID);
		sl_signPnl.putConstraint(SpringLayout.NORTH, confirmBtn, 0, SpringLayout.NORTH, initPageBtn);
		sl_signPnl.putConstraint(SpringLayout.WEST, confirmBtn, 128, SpringLayout.EAST, initPageBtn);
		sl_signPnl.putConstraint(SpringLayout.WEST, pwCLbl, 0, SpringLayout.WEST, initPageBtn);
		sl_signPnl.putConstraint(SpringLayout.SOUTH, pwCLbl, -6, SpringLayout.NORTH, inputPWC);
		sl_signPnl.putConstraint(SpringLayout.WEST, pwLbl, 0, SpringLayout.WEST, initPageBtn);
		sl_signPnl.putConstraint(SpringLayout.SOUTH, pwLbl, -6, SpringLayout.NORTH, inputPW);
		sl_signPnl.putConstraint(SpringLayout.NORTH, inputPWC, 61, SpringLayout.SOUTH, inputPW);
		sl_signPnl.putConstraint(SpringLayout.NORTH, inputPW, 44, SpringLayout.SOUTH, inputID);
		sl_signPnl.putConstraint(SpringLayout.WEST, inputPW, 0, SpringLayout.WEST, initPageBtn);
		sl_signPnl.putConstraint(SpringLayout.WEST, inputPWC, 0, SpringLayout.WEST, initPageBtn);
		sl_signPnl.putConstraint(SpringLayout.NORTH, inputID, 58, SpringLayout.NORTH, signPnl);
		sl_signPnl.putConstraint(SpringLayout.WEST, idLbl, 0, SpringLayout.WEST, initPageBtn);
		sl_signPnl.putConstraint(SpringLayout.SOUTH, idLbl, -6, SpringLayout.NORTH, inputID);
		sl_signPnl.putConstraint(SpringLayout.WEST, inputID, 0, SpringLayout.WEST, initPageBtn);
		sl_signPnl.putConstraint(SpringLayout.NORTH, initPageBtn, 5, SpringLayout.NORTH, signPnl);
		sl_signPnl.putConstraint(SpringLayout.WEST, initPageBtn, 47, SpringLayout.WEST, signPnl);
		signPnl.setLayout(sl_signPnl);

		initPageBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(pnl, "Login");
			}
		});

		getContentPane().add(pnl);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);

	}

	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}
