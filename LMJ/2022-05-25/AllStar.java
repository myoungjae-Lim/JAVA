import java.util.Scanner;
public class AllStar{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("출력하실 모양과 층수를 입력하세요.");
		int select = scan.nextInt();
		int replay = scan.nextInt();
		switch(select){
			case 1:
				for(int i = 1; i <= replay;i++){
					for(int j = 0;j < i;j++){
						System.out.print('*');
					}
					System.out.println();
				}
				break;
			case 2:
				for(int i = replay; i >= 1;i--){
					for(int j = 0;j < i;j++){
						System.out.print('*');
					}
					System.out.println();
				}				
				break;
			case 3:
				for(int i = 1; i <= replay;i++){
					for(int j = replay; j > i;j--){
						System.out.print(" ");
					}  
					for(int j = 1; j <= i;j++){
						System.out.print("*");
					}
					System.out.println();
				}		
				break;
			case 4:
				for(int i = 1;i <= replay;i++){
					
					for(int j = replay; j > i;j--){
						System.out.print(" ");
					}
					for(int k = 1;k <= i * 2 -1;k++){
						System.out.print("*");
					}
					System.out.println();
				}
				break;
		    case 5:
				for(int i = 1;i <= replay;i++){
					
					for(int j = 1; j < i;j++){
						System.out.print(" ");
					}
					for(int k = replay * 2;k >= i * 2 ;k--){
						System.out.print("*");
					}
					System.out.println();
				}
				break;
		}
	}
}