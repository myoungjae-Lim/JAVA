import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame(){
		
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JLabel lable1 = new JLabel("인간에게 주어진 최상의 선물은 마음껏 웃을 수 있다는 것이다.");
		JLabel lable2 = new JLabel("가능한 목표라고 하더라도 그것을 꿈꾸고 상상하는 순간 이미 거기에 다가가 있는것이다.");
		JLabel lable3 = new JLabel("상상력은 생존의 힘이다.");
		
		panel.add(lable1);
		panel.add(lable2);
		panel.add(lable3);
		add(panel);
		
		setVisible(true);
		
	}
}

public class TestFrame2{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}