import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main7 extends JFrame {
	int test = 0;
	int count = 0;
	public Main7() {		
		super("퀴즈");
		
		JPanel pnlQuiz = new JPanel();
		JPanel pnlAnswer = new JPanel();
		JPanel pnlAll = new JPanel();
		JPanel pnlScore = new JPanel();
		
		JButton btnClose = new JButton("종료");
		
		
		BoxLayout box = new BoxLayout(pnlAll, BoxLayout.Y_AXIS);
		pnlAll.setLayout(box);
		
		GridLayout grid = new GridLayout(1,2);
		pnlQuiz.setLayout(grid);
		
		JLabel quiz = new JLabel(Quiz());
		quiz.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
		quiz.setForeground(Color.BLUE);
		quiz.setFont(quiz.getFont().deriveFont(100.0f));
		
		JTextField answer = new JTextField(20);
		JButton yes = new JButton("확인");
		JLabel goal = new JLabel();
		
		JLabel score =new JLabel("점수: " + count);
		score.setFont(score.getFont().deriveFont(100.0f));
		
		yes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				String text = answer.getText();
				String[] str = quiz.getText().split(" ");
				for(int i = 0; i < str.length;i++) {
					if(onlyNumber(str[i])) {
						sum += Integer.valueOf(str[i]);
					}
				}
				if(sum == Integer.valueOf(text)) {
					goal.setText("정답");
					count++;
				} else {
					goal.setText("오답");
				}
				answer.setText("");
				score.setText("점수: " + count);
				quiz.setText(Quiz());
				
			}
		});
		
		btnClose.addActionListener(new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Main7.this, "수고하셨습니다.\n최종점수는:" + count + " 점 입니다.");
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
		});
		
		pnlQuiz.add(quiz,"North");
		
		pnlAnswer.add(answer);
		pnlAnswer.add(yes);
		pnlAnswer.add(goal);
		
		pnlScore.add(score);
		pnlAll.add(pnlQuiz);
		pnlAll.add(pnlAnswer);
		pnlAll.add(pnlScore);
		pnlAll.add(btnClose);
		
		add(pnlAll);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public boolean onlyNumber(String s) {
		for(int i = 0;i < s.length();i++) {
			int c = s.charAt(i) - '0';
			if(c < 0 || c > 9) {
				return false;
			}
		}
		return true;
	}
	
	public String Quiz() {
		Random random = new Random();
		int n = random.nextInt(10) + 1;
		int m = random.nextInt(10) + 1;
		return n + " + " + m + " = ?";
	}
	
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}
