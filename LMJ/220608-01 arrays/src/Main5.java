import java.util.Arrays;

public class Main5 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int[] copy = Arrays.copyOf(arr, 6);
		
		System.out.println(Arrays.toString(copy));

	}

}
