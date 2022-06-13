import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {	
	static int m;
	static int n;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map = new int[101][101];
	static boolean[][] visited = new boolean[101][101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		
		for(int i = 0; i < n;i++) {
			String[] arr = new String[m];
			arr = br.readLine().split("");
			for(int j = 0; j < m;j++) {
				map[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		bfs(0, 0);
		System.out.println(map[n - 1][m - 1]);

	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x, y});
		
		while(!queue.isEmpty()) {
			int location[] = queue.poll();
			visited[x][y] = true;
			
			for(int i = 0; i < 4; i++) {
				int nx = location[0] + dx[i];
				int ny = location[1] + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if(map[nx][ny] == 1 && !visited[nx][ny]) {
						queue.offer(new int[] {nx, ny});
						visited[nx][ny] = true;
						map[nx][ny] = map[location[0]][location[1]] + 1; 
					}
				}
			}
		}
	}
	
	

}