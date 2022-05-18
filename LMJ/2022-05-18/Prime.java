public class Prime{
	public static void main(String args[]){
		int i,k;
		int count = 0;
		for(i=2;i<100;i++){
			for(k=2;k<i;k++){
				if(i%k==0){
					count++;
				}
			}
			if(count == 0){
				System.out.printf(" %d ",i);
			}
						
			count = 0;
		}
		
	}
}