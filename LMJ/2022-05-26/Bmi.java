// 4. 키(M단위)와 몸무게(KG단위)를 전달받아 
// 한국기준 BMI 지수 구해 반환하는 메소드.
// BMI = 몸무게 / 키*키

import java.util.Scanner;

public class Bmi{
	
	public static double bmi(double height, double weight){
		return weight / (height * height);
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		double bmi = bmi(height, weight);
		System.out.println(bmi);
	}
}