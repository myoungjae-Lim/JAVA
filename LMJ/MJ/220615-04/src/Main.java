public class Main {
	public static void main(String[] args) {
		Hello ks = new KoreanStudent("홍길동", 20);
		Hello us = new UKStudent("해리포터", 17);
		Hello s = new American();
		
		Hello[] arr = new Hello[3];
		arr[0] = ks;
		arr[1] = us;
		arr[2] = s;
		
		
		for(int i = 0; i < arr.length;i++) {
			 arr[i].hi();
		}
	
	}
}
