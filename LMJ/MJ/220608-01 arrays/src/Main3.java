import java.util.Arrays;

public class Main3 {
	
	public static boolean arrEqual(int[] a, int[] b) {
		boolean e = true;
		
		if(a.length == b.length) {
			e = true;
		}
		else {
			e = false;
		}
		
		for(int i = 0;i < a.length;i++) {
			if(a[i] != b[i]) {
				e = false;
				break;
			}
		}
		
		return e;		
	}
	
	public static void main(String[] args) {
		int[] test = {50, 70, 90, 110};
		int[] c = copyArray(test);
		System.out.println(Arrays.toString(c));
		System.out.println(arrEqual(test, c));

	}

	private static int[] copyArray(int[] test) {
		int[] arr = new int[test.length];
		for(int i = 0;i < test.length;i++) {
			arr[i] = test[i];
		}
		return arr;
	}

}
