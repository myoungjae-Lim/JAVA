public class PrimeAll{
	public static void main(String args[]){
		
		for(int i = 2;i < 100;i++){
			int count = 0;
			if( i == 2){
				System.out.println(i);
			}
			else{
				for(int j = 2; j < i;j++){
					if(i % j == 0){
						break;
					} else if(j == i - 1){
						System.out.println(i);
					}
				}
			}			
		}
	}
}