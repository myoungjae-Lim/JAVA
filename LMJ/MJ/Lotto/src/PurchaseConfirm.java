import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PurchaseConfirm extends JPanel {

	private List<List<Integer>> list = new ArrayList<>();
	private JLabel[] lbls;
	private JPanel pnl;

	public List<List<Integer>> getList() {
		return list;
	}

	public void setList(List<List<Integer>> list) {
		this.list = list;
		System.out.println(this.list);
	}

	public PurchaseConfirm() {
		lbls = new JLabel[5];
		JLabel lbl = new JLabel("안녕");
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		
//		setLbl();
		for (int i = 0; i < list.size(); i++) {
			lbls[i] = new JLabel(String.valueOf(list.get(i)));
			pnl.add(lbls[i]);
		}
		
		add(lbl);
//		System.out.println(list);
		setSize(500, 500);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setLbl() {
		System.out.println(list);
	}
}
