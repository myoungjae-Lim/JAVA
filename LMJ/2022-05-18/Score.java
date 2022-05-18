// 사용자에게 국어, 영어, 수학 점수를 정수로 입력받아 총점과 평균 점수를 출력

import java.util.Scanner;

public class Score{
	public static void main(String args[]){
		int kor;
		int math;
		int eng;
		int sum;
		double avr;
		
		Scanner input = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수를 순서대로 입력해주세요.: ");
		kor = input.nextInt();
		eng = input.nextInt();
		math = input.nextInt();
		
		sum = kor + eng + math;
		avr = sum / 3.0;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avr);
		
	} 
}