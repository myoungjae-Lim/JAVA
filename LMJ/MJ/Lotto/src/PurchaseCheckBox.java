import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PurchaseCheckBox extends JFrame implements ActionListener {
	private JCheckBox[] cbs;
	private Set<Integer> set = new HashSet<>();

	public PurchaseCheckBox() {
		super("구매");
		List<List<Integer>> lottoList = new ArrayList<>();

		JPanel allPnl = new JPanel();

		JPanel leftPnl = new JPanel();

		JPanel purchasePnl = new JPanel();
		JPanel checkboxPnl = new JPanel();
		JPanel bPnl = new JPanel();

		JPanel confirmPnl = new JPanel();

//		배치관리자 설정 부분
// --------------------------------------------------------------------------------
		BoxLayout leftBox = new BoxLayout(leftPnl, BoxLayout.Y_AXIS);
		leftPnl.setLayout(leftBox);

		BoxLayout purchasBox = new BoxLayout(purchasePnl, BoxLayout.Y_AXIS);
		purchasePnl.setLayout(purchasBox);

		BoxLayout confirmBox = new BoxLayout(confirmPnl, BoxLayout.Y_AXIS); // 구매확인 Panel의 배치를 box로
		confirmPnl.setLayout(confirmBox);
// --------------------------------------------------------------------------------

//		왼쪽 버튼들
// --------------------------------------------------------------------------------
		JRadioButton menualRB = new JRadioButton("수동");
		JRadioButton mixRB = new JRadioButton("혼합");
		JRadioButton autoRB = new JRadioButton("자동");
		ButtonGroup group = new ButtonGroup();

		group.add(menualRB);
		group.add(autoRB);
		group.add(mixRB);

		menualRB.setSelected(true);

		menualRB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				checkboxAllTrue();
				checkboxAllInit();
				set.removeAll(set);
			}
		});

		mixRB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				checkboxAllTrue();
				checkboxAllInit();
				set.removeAll(set);
			}
		});

		autoRB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				checkboxAllFalse();
				checkboxAllInit();
				set.removeAll(set);
			}
		});

//		JButton menualBtn = new JButton("혼합");
//		JButton autoBtn = new JButton("자동");
//
//		menualBtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				checkboxAllTrue();
//			}
//		});
//
//		autoBtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				checkboxAllFalse();
//			}
//		});

// --------------------------------------------------------------------------------		

//			구매 확인 panel 구성 부분
//--------------------------------------------------------------------------------

		JLabel purchaseConfrimLbl = new JLabel("구매 확인");
		confirmPnl.add(purchaseConfrimLbl);

		JPanel[] lottoPnl = new JPanel[5];

		// 로또 번호를 받는 5개의 panel을 생성
		for (int i = 0; i < lottoPnl.length; i++) {
			lottoPnl[i] = new JPanel();
			confirmPnl.add(lottoPnl[i]);
		}

		JLabel countPurchaseLbl = new JLabel("횟수 나타 낼거임");
		confirmPnl.add(countPurchaseLbl);

		JLabel[][] lbl = new JLabel[5][7];

		// 구매 확인에서 첫번째 문자 넣어줌
		for (int i = 0; i < lottoPnl.length; i++) {
			char c = (char) ('A' + i);
			lbl[i][0] = new JLabel(String.valueOf(c));
			lottoPnl[i].add(lbl[i][0]);
		}

		// 구매 확인에서 로또 번호들을 나열하기 위해 label들을 생성
		for (int i = 0; i < lottoPnl.length; i++) {
			for (int j = 1; j < lbl[i].length; j++) {
				lbl[i][j] = new JLabel();
				lottoPnl[i].add(lbl[i][j]);
			}

		}
// --------------------------------------------------------------------------------

//			체크박스 부분
// --------------------------------------------------------------------------------
		JButton btn = new JButton("구매");
//		JCheckBox autoCb = new JCheckBox("자동 선택");

		GridLayout grid = new GridLayout(5, 9); // 체크박스 배열 해놓은것

		checkboxPnl.setLayout((grid));
		cbs = new JCheckBox[45];

		for (int i = 0; i < cbs.length; i++) { // 체크박스 값 입력
			cbs[i] = new JCheckBox(String.valueOf(i + 1));
			cbs[i].addActionListener(this);
			checkboxPnl.add(cbs[i]);
		}
// --------------------------------------------------------------------------------

//			구매 버튼 클릭 이벤트
// --------------------------------------------------------------------------------
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (lottoList.size() == 5) { // 5장 넘게 구매X
					JOptionPane.showMessageDialog(purchasePnl, "복권은 한번에 5장까지 구매 가능합니다.");
				} else {
					if (mixRB.isSelected()) {

						while (set.size() < 6) {
							set.add(new Random().nextInt(45) + 1);
						}

						List<Integer> list = new ArrayList<Integer>(set);
						Collections.sort(list);
						lottoList.add(list);

						checkboxAllInit();

						set.removeAll(set); // set을 초기화

					} else if (menualRB.isSelected()) {
						if (set.size() == 6) {
							List<Integer> list = new ArrayList<Integer>(set);
							Collections.sort(list);
							lottoList.add(list);
							checkboxAllInit();
							set.removeAll(set);
						} else {
							JOptionPane.showMessageDialog(purchasePnl, "번호 6개를 선택해 주세요");

						}
					} else {
						while (set.size() < 6) {
							set.add(new Random().nextInt(45) + 1);
						}

						List<Integer> list = new ArrayList<Integer>(set);
						Collections.sort(list);
						lottoList.add(list);

						checkboxAllInit();

						set.removeAll(set); // set을 초기화
					}

//					System.out.println(lottoList);
//					System.out.println(lottoList.size());

					// 구매 확인창에 번호를 보내줌
					for (int i = 0; i < lottoList.size(); i++) {
						for (int j = 0; j < lottoList.get(i).size(); j++) {
							lbl[i][j + 1].setText(String.format("%02d", lottoList.get(i).get(j)));
						}
					}
					if (autoRB.isSelected()) {
						checkboxAllFalse();
					} else {
						checkboxAllTrue();
					}
				}
			}
		});
// --------------------------------------------------------------------------------
		leftPnl.add(menualRB);
		leftPnl.add(mixRB);
		leftPnl.add(autoRB);

//		leftPnl.add(menualBtn);
//		leftPnl.add(autoBtn);

		bPnl.add(btn);
//		bPnl.add(autoCb);
		purchasePnl.add(checkboxPnl);
		purchasePnl.add(bPnl);

		allPnl.add(leftPnl);
		allPnl.add(purchasePnl);
		allPnl.add(confirmPnl);

		getContentPane().add(allPnl);
		setSize(1000, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new PurchaseCheckBox().setVisible(true);
	}

	// checkbox를 모두 활성화
	public void checkboxAllTrue() {
		for (int i = 0; i < cbs.length; i++) {
			cbs[i].setEnabled(true);
		}
	}

	// checkbox를 모두 비활성화
	public void checkboxAllFalse() {
		for (int i = 0; i < cbs.length; i++) {
			cbs[i].setEnabled(false);
		}
	}

	// checkbox를 모두 초기화
	public void checkboxAllInit() {
		for (int i = 0; i < cbs.length; i++) {
			cbs[i].setSelected(false);
		}
	}

	// 구매하기 버튼 이벤트 set에 값을 넣는 과정
	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < cbs.length; i++) {
			if (e.getSource() == cbs[i]) {
				if (cbs[i].isSelected()) {
					set.add(i + 1);
				} else {
					set.remove(i + 1);
				}

			}
			if (set.size() == 6) {
				for (int j = 0; j < cbs.length; j++) {
					if (!cbs[j].isSelected()) {
						cbs[j].setEnabled(false);
					}
				}
			} else {
				checkboxAllTrue();
			}
		}

	}
}
