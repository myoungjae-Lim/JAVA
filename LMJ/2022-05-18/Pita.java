public class Pita{
	public static void main(String args[]){
		int a,b,c;
		
		for(a=1;a<100;a++){
			for(b=1;b<100;b++){
				for(c=1;c<100;c++){
					if(a*a+b*b==c*c){
						System.out.printf("피타고라스 정리를 만족하는 세 정수: %d %d %d\n", a, b, c);
					}
				}
			}
		}
	}
}