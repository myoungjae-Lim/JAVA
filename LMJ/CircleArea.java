import java.util.Scanner;

public class CircleArea{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		double radius;
		double area;
		
		System.out.print("반지름을 입력하세요: ");
		radius = input.nextDouble();
		area = 3.14*radius*radius;

		System.out.print("원의 면적: " + area);
	}
}