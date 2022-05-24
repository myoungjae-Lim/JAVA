// 2의 제곱 수를 32개 나열하고 결과값을 확인해보세요
// 2 4 8 16 32 64 128 256 .....
public class TwoSquare{
	public static void main(String args[]){
		long two = 2L;
		
		for(int i = 0; i < 32; i++){			
			System.out.println(two);
			two *= 2;
		}	
	}
}
