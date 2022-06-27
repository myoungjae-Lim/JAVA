import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		JPanel panel = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();

		URL url = Main4.class.getClassLoader().getResource("images/free-icon-star-2107957.png"); // class에 담겨있는 자원들을
																									// 찾을수있는 기능 제공
		Image image = kit.getImage(url);
		URL url2 = Main4.class.getClassLoader().getResource("images/춘식3.png"); // class에 담겨있는 자원들을 찾을수있는 기능 제공
		Image image2 = kit.getImage(url2);

//		Image image = kit.getImage("free-icon-star-2107957.png"); 
//		Image image2 = kit.getImage("춘식3.png"); 

		JLabel lbl = new JLabel(new ImageIcon(image)); // label 에서 text뿐 아니라 이미지도 보여 줄수있음.
		panel.add(lbl);

		lbl.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(new ImageIcon(image2));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(new ImageIcon(image));
			}

		});

		add(panel);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
