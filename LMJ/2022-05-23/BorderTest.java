import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame(){
		
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("NORTH"), BorderLayout.NORTH);
		add(new JButton("EAST"), BorderLayout.EAST);
		add(new JButton("WEST"), BorderLayout.WEST);
		add(new JButton("SOUTH"), BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		
	}
}

public class BorderTest{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}