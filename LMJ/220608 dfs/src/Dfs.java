import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dfs {

	static int[][] graph = new int[1001][1001];
	static boolean[] visited = new boolean[1001]; 
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		for(int i = 0;i < m;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u][v] = graph[v][u] = 1;
		}
		
		dfs(V);
	}
	
	public static void dfs(int V) {
		visited[V] = true;
		System.out.print(V + " ");
		
		for(int i = 1; i <= n;i++) {
			if(!visited[i] && graph[V][i] == 1 ) {
				visited[i] = true;
				dfs(i);
			}
		}
	}
}