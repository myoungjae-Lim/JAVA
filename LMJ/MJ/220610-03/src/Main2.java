import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		// 2 ~ 5 의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 
		// 3 9 27 81
		// 4 16 64 256
		
		int[][] arr = new int[4][10];
		
		for(int i = 0; i < 4; i++) {
			int n = 1;
			for(int j = 0; j < 10; j++) {
				n *= i + 2;
				arr[i][j] = n; 
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}

}
