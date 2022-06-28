import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PurchaseConfirm extends JDialog {
	private JPanel pnl;
	private JLabel lbl;
	private List<Set<Integer>> list = new ArrayList<>();
	
	public List<Set<Integer>> getList() {
		return list;
	}

	public void setList(List<Set<Integer>> list) {
		System.out.println(list);
		this.list = list;
	}

	public PurchaseConfirm(JFrame owner) {
		super(owner);
		setTitle("구매 확인 창");
		
		pnl = new JPanel();
		lbl = new JLabel("새창");
		
		
		pnl.add(lbl);
		add(pnl);
		setSize(500, 500);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
