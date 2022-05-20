// 사용자의 학점
// 점수를 입력받아 
// 90점이상 ~ A
// 80 ~ 90 B
// 70 ~ 80 C 
// 60 ~ 70 D
// 60점 미만 F
import java.util.Scanner;

public class UserGrade{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char grade;
		
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();
		
		
		if(score >= 90){
			grade = 'A';
		}
		else if(score >= 80){
			grade = 'B';
		}
		else if(score >= 70){
			grade = 'C';
		}
		else if(score >= 60){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		
		System.out.println("당신의 학점은: " + grade + "입니다.");
	}
}