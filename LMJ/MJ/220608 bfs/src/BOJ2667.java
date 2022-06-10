import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2667 {
	static int map[][];
	static boolean visited[][];
	static int N;
	static int count = 0;
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, 1, -1};
	
	public static void dfs(int x,int y) {
		visited[x][y] = true;
		map[x][y] = 1 + count;
		
		for(int i = 0; i < 4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if(map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		for(int i = 0; i < N; i++) {
			String[] input = br.readLine().split("");
			for(int j = 0; j < N;j++) {
				map[i][j] = Integer.parseInt(input[j]);
			}
		}
		visited = new boolean[N][N];
		
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < N;j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					dfs(i, j);
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		int[] result = new int[count + 1];
		
		for(int i = 0; i < N;i++) {
			for(int j = 0;j < N;j++) {
				if(map[i][j] != 0) {
					result[map[i][j]]++;
				}
			}
		}
		
		Arrays.sort(result);
		for(int i = 1; i < result.length;i++) {
			System.out.println(result[i]);
		}
	}
}