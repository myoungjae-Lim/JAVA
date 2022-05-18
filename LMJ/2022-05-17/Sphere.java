import java.util.Scanner;

public class Sphere{
	public static void main(String args[]){
		double r;
		double sphere;
		
		Scanner input = new Scanner(System.in);
		System.out.print("구의 반지름을 입력하세요: ");
		r = input.nextDouble();
		
		sphere = (4.0/3.0)*r*r*r;
		
		System.out.println("구의 부피는: " + sphere );
		
	}
}