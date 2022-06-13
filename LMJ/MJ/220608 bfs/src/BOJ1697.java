import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1697 {
	
	public static int n;
	public static int k;
	public static int count = 0;
	public static int[] visited;
	
	public static void bfs(int x) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(x);
		visited[x] = 0;
		
		while(!queue.isEmpty()) {
			int dx = queue.poll();
			if(visited[k] != 0) {
				break;						
			}
			
			if(dx + 1 < visited.length && visited[dx + 1] == 0) {
				queue.offer(dx +1);
				visited[dx + 1] = visited[dx] + 1;
			}
			if(dx - 1 >= 0 && visited[dx - 1] == 0) {
				visited[dx - 1] = visited[dx] + 1;
				queue.offer(dx - 1);
			}
			if(2 * dx < visited.length  && visited[dx * 2] == 0) {
				queue.offer(dx * 2);
				visited[dx * 2] = visited[dx] + 1;
			}
		}				
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		k = scan.nextInt();
		visited = new int[100001];
		
		if(n == k) {
			System.out.println(0);
			return;
		}
		
		bfs(n);
		
		System.out.println(visited[k]);

	}

}
