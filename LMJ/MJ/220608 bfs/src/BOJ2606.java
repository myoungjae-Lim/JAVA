import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2606 {
	
	public static int[][] map;
	public static boolean[] visited;
	public static int count = 0;
	public static int n;
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		visited[start] = true;
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			
			for(int i = 1; i < map.length;i++) {
				if(map[x][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
					count++;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		map = new int[n + 1][n + 1];
		visited = new boolean[n + 1];
		
		for(int i = 0; i < m;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			map[u][v] = map[v][u] = 1;
		}
		
		bfs(1);
		
		System.out.println(count);
		
	}

}
