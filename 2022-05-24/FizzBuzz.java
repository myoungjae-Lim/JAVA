// Fizz buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16....

public class FizzBuzz{
	public static void main(String args[]){
		for(int i = 1;i <= 35; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.print("Fizz Buzz ");
			} else if(i % 3 == 0){
				System.out.print("Fizz ");
			} else if(i % 5 == 0){
				System.out.print("Buzz ");
			} else{
				System.out.print(i + " ");
			}
			
		}
	}
}