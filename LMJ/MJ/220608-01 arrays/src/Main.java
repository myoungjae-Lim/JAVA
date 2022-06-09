
public class Main {

	public static void main(String[] args) {
		int[] arr = {15, 32, 222, 119, 534, 36, 9, 1234};
		int count = 0;
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] / 100 == 0 && arr[i] / 10 != 0) {
				count++;
			}
		}
		
		System.out.println("개수: " + count);
		System.out.println("-- 목록 --");
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] / 100 == 0 && arr[i] / 10 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
