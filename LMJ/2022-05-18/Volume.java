import java.util.Scanner;

public class Volume{
	public static void main(String args[]){
		int r,h;
		double volume;
		
		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		r = input.nextInt();
		System.out.print("원기둥 높이를 입력하시오: ");
		h = input.nextInt();
		
		volume = 3.14*(r*r*h);
		System.out.printf("원기둥의 부피는 %.2f입니다.",volume);
	}
}