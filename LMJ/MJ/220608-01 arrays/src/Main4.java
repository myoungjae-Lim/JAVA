import java.util.Arrays;

public class Main4 {
	// 두개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	public static int[] arrayPlus(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for(int i = 0; i < a.length;i++) {
			c[i] = a[i];			
		}
		for(int i = a.length;i < c.length;i++) {
			c[i] = b[i - a.length];
		}
		return c;
	}
	
	// 두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드 
	public static int[] arraySum(int[] a, int[] b) {
		if(a.length > b.length) {
			int[] c = new int[a.length];
			for(int i = 0;i < c.length;i++) {
				if(i < b.length) {
					c[i] = a[i] + b[i];
				}
				else {
					c[i] = a[i];
				}
			}
			return c;
		}
		else {
			int[] c = new int[b.length];
			for(int i = 0;i < c.length;i++) {
				if(i < a.length) {
					c[i] = a[i] + b[i];
				}
				else {
					c[i] = b[i];
				}
			}
			return c;
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		int[] larger = new int[5];
		
		for(int i = 0 ; i < arr.length;i++) {
			larger[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arraySum(arr, larger)));

	}

}
