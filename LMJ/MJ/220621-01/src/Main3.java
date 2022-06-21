import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("원소1");
		queue.offer("원소 2");
		
		System.out.println(queue);
		System.out.println(queue.peek());
				
	}
	
}
