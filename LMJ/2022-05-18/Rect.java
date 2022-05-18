// 사용자의 사각형의 밑변과 높이를 정수로 입력 
// 사각형의 둘레와 넓이를 출력
import java.util.Scanner;

public class Rect{
	public static void main(String args[]){
		int w,h,area,premiter;

		Scanner input = new Scanner(System.in);

		System.out.print("가로를 입력하세요: ");
		w = input.nextInt();
		System.out.print("세로를 입력하세요: ");
		h = input.nextInt();
		area = w*h;
		premiter = 2*w + 2*h;

		System.out.println("사각형의 넓이: " + area);
		System.out.println("사각형의 둘레: " + premiter);
	}
}