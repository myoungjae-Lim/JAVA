import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame(){
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel labelA = new JLabel("자바 호텔에 오신 것을 확인합니다.");
		JLabel labelB = new JLabel("숙박일수를 입력하세요.");
		panelA.add(labelA);
		panelA.add(labelB);
		
		JButton b1 = new JButton("1명");
		JButton b2 = new JButton("2명");
		JButton b3 = new JButton("3명");
		JButton b4 = new JButton("4명");
		JButton b5 = new JButton("5명");
		panelB.add(b1);
		panelB.add(b2);
		panelB.add(b3);
		panelB.add(b4);
		panelB.add(b5);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		
		setVisible(true);
	}
}

public class TestFrame3{
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}