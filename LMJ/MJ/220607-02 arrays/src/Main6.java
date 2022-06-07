import java.util.Scanner;
import java.util.ArrayList;
public class Main6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5]; 
		int i = 0;
		while(true) {
			int n = scan.nextInt();
			if(n < 0) {
				break;
			}
			arr[i] = n;
			i++;
			if(i == 5) {
				i = 0;
			}			
		}
		
		for(i = 0;i < 5;i++) {
			System.out.println(arr[i]);
		}
		
//		Scanner scan = new Scanner(System.in);
//		ArrayList<Integer> list = new ArrayList<>();  
//		int i = 0;
//		while(true) {
//			list.add(scan.nextInt());
//			if(list.get(i) < 0) {
//				for(int j = i - 1;j > i - 6;j--) {
//					System.out.println(list.get(j));
//					
//				}
//				break;
//			}
//			i++;
//		}
	}

}



