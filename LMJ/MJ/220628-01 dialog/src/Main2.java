import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ExitDialog extends JDialog implements ActionListener{
	private JButton btnYES;
	private JButton btnNO;
	private boolean exit;
	
	public ExitDialog(JFrame owner) {
		super(owner, "종료하시겠습니까?",true);
		
		JPanel pnl = new JPanel();
		btnYES = new JButton("종료");
		btnNO = new JButton("취소");
		
		btnYES.addActionListener(this);
		btnNO.addActionListener(this);
		
		pnl.add(btnYES);
		pnl.add(btnNO);
		
		add(pnl);
		setSize(250, 250);
	}
	
	public boolean showDialog(){
		setVisible(true);
		return exit;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnYES) {
			exit = true;
			dispose();
			System.out.println(exit);
		} else {
			exit = false;
			dispose();
			System.out.println(exit);
		}
	}
}

public class Main2 extends JFrame {
	public Main2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				ExitDialog dialog = new ExitDialog(Main2.this);
//				boolean result = dialog.showDialog();
				
				int result = JOptionPane.showConfirmDialog(Main2.this, "종료하시겠습니까?", "종료 확인", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
				
//				JOptionPane.showInputDialog(Main2.this,"입력창");
				
				
//				if(result) {
//					setDefaultCloseOperation(EXIT_ON_CLOSE);
//				} 
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
