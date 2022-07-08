import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

public class Memo extends JFrame implements ActionListener {
	private JButton openBtn;
	private JButton saveBtn;
	private JTextArea ta;
	private JFileChooser chooser;
	private JPanel pnl;
	FileFilter filter = new FileFilter() {
		@Override
		public String getDescription() {
			return "텍스트 파일";
		}

		@Override
		public boolean accept(File f) {
			if (f.isDirectory()) {
				return true;
			}
			return f.getName().endsWith(".txt");
		}
	};

	public Memo() {
		super("메모장");
		pnl = new JPanel();
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(box);

		JPanel btnPnl = new JPanel();
		JPanel textPnl = new JPanel();

		openBtn = new JButton("열기");
		openBtn.addActionListener(this);
		saveBtn = new JButton("저장");
		saveBtn.addActionListener(this);

		ta = new JTextArea(40, 40);
		ta.setBackground(Color.white);

		chooser = new JFileChooser();
		chooser.setFileFilter(filter);

		btnPnl.add(openBtn);
		btnPnl.add(saveBtn);

		textPnl.add(ta);

		pnl.add(btnPnl);
		pnl.add(textPnl);
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == openBtn) {
			int result = chooser.showOpenDialog(null);
			if (result == 0) {
				File file = chooser.getSelectedFile();
				BufferedReader br = null;

				try {
					br = new BufferedReader(new FileReader(file));
					String str = "";
					String line;
					while ((line = br.readLine()) != null) {
						str += line;
						str += "\n";
					}
					ta.setText(str);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}

		}
		if (e.getSource() == saveBtn) {
			int result = chooser.showSaveDialog(null);
			String txt = chooser.getSelectedFile().getName()
					.substring(chooser.getSelectedFile().getName().length() - 3);
			String whatFilter = chooser.getFileFilter().getDescription();
			if (result == 0) {
				if (txt.equals("txt") || whatFilter.equals("모든 파일")) {
					File file = chooser.getSelectedFile();
					PrintWriter pw = null;
					try {
						pw = new PrintWriter(file);
						pw.println(ta.getText());
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} finally {
						if (pw != null) {
							pw.close();
						}
					}
				} else {
					File file = new File("d:\\filetest\\" + chooser.getSelectedFile().getName() + ".txt");

					PrintWriter pw = null;
					try {
						pw = new PrintWriter(file);
						pw.println(ta.getText());
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} finally {
						if (pw != null) {
							pw.close();
						}
					}
				}

			}
		}
	}
}
