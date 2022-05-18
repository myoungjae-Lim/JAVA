import java.util.Scanner;

public class Box{
	public static void main(String args[]){
		double w,h,area,premiter;

		Scanner input = new Scanner(System.in);

		System.out.print("가로를 입력하세요: ");
		w = input.nextDouble();
		System.out.print("세로를 입력하세요: ");
		h = input.nextDouble();
		area = w*h;
		premiter = 2*w + 2*h;

		System.out.println("사각형의 넓이: " + area);
		System.out.println("사각형의 둘레: " + premiter);
	}
}