import java.util.Scanner;

public class Arrange{
	public static void main(String args[]){
		int x,y,z;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		x = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		y = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		z = input.nextInt();
		
		if(x < y){
			if(y < z){
				System.out.printf("정열된 숫자: %d %d %d ", x, y, z);
			}
			else{
				if(x < z){
						System.out.printf("정열된 숫자: %d %d %d ", x, z, y);
				}
				else{
					System.out.printf("정열된 숫자: %d %d %d ", z, x, y);
				}
				
			}
		}
		else{
			if(x < z){
				System.out.printf("정열된 숫자: %d %d %d ", y, x, z);
			}
			else{
				if(y < z){
						System.out.printf("정열된 숫자: %d %d %d ", y, z, x);
				}
				else{
					System.out.printf("정열된 숫자: %d %d %d ", z, y, x);
				}
				
			}
		}
	}
}