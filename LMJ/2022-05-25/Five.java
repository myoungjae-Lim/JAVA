public class Five{
	public static void main(String args[]){
		for(int i = 1; i <= 5;i++){
			if(i % 2 == 1){
				for(int j = 1; j <= 5;j++){
					System.out.printf(" (%d) ", j);
				}
			}
			if(i % 2 == 0){
				for(int j = 5; j > 0;j--){
					System.out.printf(" (%d) ", j);
				}
			}
			System.out.println();
		}
	}
}