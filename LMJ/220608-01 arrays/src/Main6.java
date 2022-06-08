import java.util.Arrays;

public class Main6 {
	
	public static int[] someMethod(int... arr) {
		for(int number : arr) {
			System.out.println(number);
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		int[] arr2 = someMethod(40, 50, 60, 70, 80);
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
