import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJun2667 {
    static int map[][];
    static boolean visit[][]; // 방문 여부
    static int N; // 지도 최대 크기
    static int count = 0; // 총 단지 수
    static int dx[] = {-1, 1, 0, 0}; // row
    static int dy[] = {0, 0, -1, 1}; // col

    public static void dfs(int x,int y) {
    	visit[x][y] = true;
    	map[x][y] = 1 + count;
    	
    	for(int i = 0;i < 4;i++) {
    		int nx = x + dx[i];
    		int ny = y + dy[i];
    		
    		if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
    			if(map[nx][ny] == 1 && !visit[nx][ny]) {
    				dfs(nx,ny);
    			}
    		}
    	}
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split("");
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(input[j]);
            }
        }

        visit = new boolean[N][N];
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] == 1 && !visit[i][j]) { // 집이 있으면서 방문하지 않은 곳
                    dfs(i, j); // 연결 되어있는 단지 탐색
                    count++; // 다음 단지 수로 이동
                }
            }
        }

        // 총 단지 수
        System.out.println(count);
        // 단지 내 집의 수
        int result[] = new int[count + 1];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] != 0)
                    result[map[i][j]]++;
            }
        }
        
        // 단지수를 오름차순으로 정렬하여 출력
        Arrays.sort(result);
        for(int i=1; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
}