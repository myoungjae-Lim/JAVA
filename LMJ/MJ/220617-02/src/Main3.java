import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot donut";
		StringBuilder sb = new StringBuilder(longLine);
		
		StringTokenizer st = new StringTokenizer(longLine," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
//		String[] arr = new String[4];
//		for(int i = 0; i < 3; i++) {
//			int spaceIndex = sb.indexOf(" ");
//			arr[i] = sb.substring(0, spaceIndex);
//			sb.replace(0, spaceIndex + 1, "");
//		}
//		
//		System.out.println(arr[2]);
	}
}