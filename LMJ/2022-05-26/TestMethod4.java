import java.util.Scanner;

public class TestMethod4{
	public static boolean OneToHundred(int i){
		if(1 <= i && i <= 100){
			return true;
		}
		else{
			return false;
		}
	}
	
	// 사용자가 점수 입력을 3번 하는데 점수는 무조건 1~100사이의
	// 점수 합을 출력해보세요
	public static int sum(int math, int korean, int english){
		return math + korean + english;
	}
	public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int math = 0;
			int korean = 0;
			int english = 0;
			
			while(true){
				System.out.print("수학점수를 입력하세요");
				math = scan.nextInt();
				if(OneToHundred(math)){
					break;
				} else{
					System.out.println("잘못입력하셨습니다.");
				}
			}
			
			while(true){
				System.out.print("국어점수를 입력하세요");
				korean = scan.nextInt();
				if(OneToHundred(korean)){
					break;
				} else{
					System.out.println("잘못입력하셨습니다.");
				}
			}
			
			while(true){
				System.out.print("영어점수를 입력하세요");
				english = scan.nextInt();
				if(OneToHundred(english)){
					break;
				} else{
					System.out.println("잘못입력하셨습니다.");
				}
			}
			
			int sum = sum(math, korean, english);
			
			System.out.println(sum);
			
			
			// int n = scan.nextInt();
			// if(OneToHundred(n)){
				// System.out.println("1과 100사이의 수입니다.");
			// }
			// else{
				// System.out.println("1과 100사이의 수가 아닙니다.");
			// }
	}
}