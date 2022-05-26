import java.util.Scanner;

public class PrimeNumbers{
	public static boolean isPrime(int i){
		int count = 0;
		for(int j = 2; j < i; j++){
			if(i % j == 0){
				count++;
			}
		} 
		if(count == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			if(isPrime(n)){
				System.out.printf("%d는 소수입니다.",n);
			}
			else{
				System.out.printf("%d는 소수가아닙니다.",n);
			}
	}
}