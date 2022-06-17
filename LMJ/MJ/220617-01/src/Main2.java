public class Main2 {
	public static void main(String[] args) {
		String s = null;
		
		try {
			int[] arr = new int[0];
			arr[1] = 10;
			int div = 10 / 0;
			s.equals("asdf");
			
			System.out.println("실행되나?");
		} catch (NullPointerException e) {
			System.out.println("널 포인트 익셉션 처리");
		} catch(ArithmeticException e) {
			System.out.println("숫자 익셉션 처리");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리");
		} catch(Exception e) {
			System.out.println("예외 처리 되었습니다.");
		} 
				
		System.out.println("정상 종료");
	}
}