import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
	
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
	}
}
public class MyFrameTest{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}