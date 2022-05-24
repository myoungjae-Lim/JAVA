// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램 

import java.util.Scanner;

public class Prime{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		System.out.print("정수를 하나 입력하세요.");
		i = scan.nextInt();
		int count = 0;
		for(int j = 2; j < i;j++){
			if(i % j == 0){
				count++;
			}
		}
		
		if(count == 0){
			System.out.printf("입력하신 정수%d는 소수입니다.\n", i);
		} else{
			System.out.printf("입력하신 정수%d는 소수가 아닙니다.\n", i);
		}
	
	}
}