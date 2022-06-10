import java.util.Arrays;
import java.util.Random;

public class Main3 {
	public static int[] rowSum(int[][] arr) {
		int[] sum = new int[arr.length];
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				sum[i] += arr[i][j];
			}
		}
		
		return sum;
	}
	
	public static int[] colSum(int[][] arr) {
		int[] sum = new int[arr[0].length];
		
		for(int i = 0; i < arr[0].length;i++) {
			for(int j = 0; j < arr.length;j++) {
				sum[i] += arr[j][i];
			}
		}
		
		return sum;
	}
	
	public static int sevenCount(int[][] arr) {
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				if(arr[i][j] == 7) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int[][] randomArray(){
		Random random = new Random();
		int[][] array = new int[5][5];
		
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array[i].length;j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		
		for(int i = 0; i < randomArray.length; i++) {
			System.out.println(Arrays.toString(randomArray[i]));
		}
		
		// 각 행의 합
		// 각 열의 합
		// 숫자 7의 개수
		
		System.out.println("행의 합: " + Arrays.toString(rowSum(randomArray)));
		System.out.println("열의 합: " + Arrays.toString(colSum(randomArray)));
		System.out.println("7의 개수: " + sevenCount(randomArray));
	
	}

}
