import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	JPanel p1;
	public MyFrame(){
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for(int i = 0; i < 10; i++){
			p1.add(new JButton("Button" + i));
		}
		add(p1);
		setVisible(true);
	}
}
public class MyFrameTest1{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}