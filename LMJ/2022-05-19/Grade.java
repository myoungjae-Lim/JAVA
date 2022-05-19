import java.util.Scanner;

public class Grade{
	public static void main(String args[]){
		int size;
		int sum = 0;
		double avr;
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오.: ");
		size = scan.nextInt();
		int[] student = new int[size];
		
		for(int i = 0; i < student.length; i++){
			System.out.printf("학생 %d의 성적을 입력하시오: ",(i+1));
			student[i] = scan.nextInt();
			if(student[i] > 100){
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
				i--;
				continue;
			}
		}
		for(int i = 0; i < student.length; i++){
			sum += student[i];
		}
		avr = sum / student.length;
		
		System.out.printf("성적 평균은 %.1f입니다.",avr);
	}
}