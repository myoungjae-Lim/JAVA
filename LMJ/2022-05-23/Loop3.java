public class Loop3{
	public static void main(String args[]){
		// 0부터 100사이의 수 중 3의 배수 또는 7의 배수를 출력해 보세요
		// int i = 0;
		// while(i < 100){
			// if( i % 3 == 0 || i % 7 == 0)
				// System.out.println(i);
			
			// i++;
		// }
		
		// 0부터 100사이의 수 중 3,6,9 일때만 출력.
		
	    int j = 0;
		while(j < 100){
			if(j % 10 == 3 || j % 10 == 6 || j % 10 == 9){
				System.out.println(j);
			}
			j++;
		}
	}
}