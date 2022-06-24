import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Font;

public class Main2 extends JFrame implements ItemListener,ActionListener {

	private int price = 0;
	private JCheckBox check1;
	private JCheckBox check2;
	private JCheckBox check3;
	private JLabel bill;
	private JButton allSel;
	private JButton allDel;

	public Main2() {
		super("중국집");

		JPanel pnl = new JPanel();
		JPanel menuPnl = new JPanel();
		JPanel billPnl = new JPanel();

		BoxLayout box = new BoxLayout(menuPnl, BoxLayout.Y_AXIS);
		menuPnl.setLayout(box);

		check1 = new JCheckBox("짜장면 5000원");
		check2 = new JCheckBox("짬뽕 7000원");
		check3 = new JCheckBox("탕수육 10000원");
	
		bill = new JLabel("가격: " + price + "원");
		bill.setFont(new Font("굴림", Font.PLAIN, 20));
		
		allSel = new JButton("전체 선택");
		allDel = new JButton("전체 취소");
		
		pnl.add(allSel);
		pnl.add(allDel);

		menuPnl.add(check1);
		menuPnl.add(check2);
		menuPnl.add(check3);

		billPnl.add(bill);
		
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, billPnl, 54, SpringLayout.SOUTH, allDel);
		sl_pnl.putConstraint(SpringLayout.NORTH, allDel, 0, SpringLayout.NORTH, allSel);
		sl_pnl.putConstraint(SpringLayout.WEST, allDel, 19, SpringLayout.EAST, allSel);
		sl_pnl.putConstraint(SpringLayout.NORTH, allSel, 23, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, allSel, 140, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, billPnl, 75, SpringLayout.EAST, menuPnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, menuPnl, 83, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, menuPnl, 94, SpringLayout.WEST, pnl);
		pnl.setLayout(sl_pnl);

		check1.addItemListener(this);
		check2.addItemListener(this);
		check3.addItemListener(this);
		
		allSel.addActionListener(this);
		allDel.addActionListener(this);
		
		pnl.add(menuPnl);
		pnl.add(billPnl);
		getContentPane().add(pnl);

		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem() == check1) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				price += 5000;
			}
			else {
				price -= 5000;
			}
		} else if(e.getItem() == check2) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				price += 7000;
			}
			else {
				price -= 7000;
			}
		} else if (e.getItem() == check3) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				price += 10000;
			}
			else {
				price -= 10000;
			}
		}
		
		bill.setText("가격: " + price + "원");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == allSel) {
			check1.setSelected(true);
			check2.setSelected(true);
			check3.setSelected(true);
		} 
		else {
			check1.setSelected(false);
			check2.setSelected(false);
			check3.setSelected(false);
		}
	}
}
