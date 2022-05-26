import java.util.Scanner;
// 1. 원의 반지름을 전달 받아 원넓이를 반환하는 메소드 작성 후
// 메인 메소드에서 호출하여 출력을 통해 값을 확인
public class Circle{
	public static double area(double r){
		return r * r * 3.14;
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		double radius = scan.nextDouble();
		double area = area(radius);
		
		System.out.println(area);
	}
}  