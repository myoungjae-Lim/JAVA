import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {
	
	public static int[][]map;
	public static boolean[][] visited;
	public static int dx[] = {-1, 1, 0, 0};
	public static int dy[] = {0, 0, 1, -1};
	public static int n;
	public static int m;
	static Queue<int[]> queue = new LinkedList<>();
	public static void bfs() {
				
		while(!queue.isEmpty()) {
			int local[] = queue.poll();
			visited[local[0]][local[1]] = true;
			
			for(int i = 0; i < 4;i++) {
				int nx = local[0] + dx[i];
				int ny = local[1] + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if(!visited[nx][ny] && map[nx][ny] == 0) {
						queue.offer(new int[] {nx, ny});
						map[nx][ny] = map[local[0]][local[1]] + 1;
						visited[nx][ny] = true;
						
					}
				}
				
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());		
		map = new int[n + 1][m + 1];
		visited = new boolean[n + 1][m + 1];
		
		for(int i = 0; i < n;i++) {
			String[] str = br.readLine().split(" ");			
			for(int j = 0; j < m;j++) {
				map[i][j] = Integer.parseInt(str[j]);
				if(map[i][j] == 1) {
					queue.offer(new int[] {i, j});
				}
			}
		}
		
		bfs();
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m;j++) {
				if(map[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, map[i][j]);
			}
		}
		max = max - 1;
		System.out.println(max);
		
	}

}
