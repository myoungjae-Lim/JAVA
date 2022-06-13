import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1012 {
	
	public static int[][] map;
	public static boolean[][] visited;
	public static int n;
	public static int m;
	public static int dx[] = {-1, 1, 0, 0};
	public static int dy[] = {0, 0, 1, -1};
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {x, y});
		visited[x][y] = true;
		while(!queue.isEmpty()) {
			int local[] = queue.poll();
			
			for(int i = 0; i < 4;i++ ) {
				int nx = local[0] + dx[i];
				int ny = local[1] + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if(!visited[nx][ny] && map[nx][ny] == 1) {
						queue.offer(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());		
		
		for(int i = 0; i < t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			map = new int[n + 1][m + 1];
			visited = new boolean[n + 1][m + 1];
			int count = 0;
			
			for(int j = 0; j < k;j++) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				
				map[u][v] = 1;
			}
			
			for(int j = 0; j < n;j++) {
				for(int p = 0; p < m;p++ ) {
					if(!visited[j][p] && map[j][p] == 1) {
						bfs(j, p);
						count++;
					}
				}
				
			}
			System.out.println(count);
			
		}

	}

}
