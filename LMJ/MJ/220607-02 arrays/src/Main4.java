import java.util.Arrays;

public class Main4 {
	public static void printArray(char[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	public static String strArray(char[] arr) {
		String str = "";
		for(int i = 0;i < arr.length;i++) {
			str += arr[i];
		}
		return str;
	}
	
	public static int indexArray(char[] arr, char c) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == c) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		char[] hello = {'H', 'e', 'l', 'l','o'};
		String str = Arrays.toString(hello);
		System.out.println(str);
////		for(int i = 0; i < hello.length;i++) {
////			System.out.print(hello[i]);
////		}
//		
//		printArray(hello);
//		System.out.println();
//		
//		// 위의 문자 배열에 o 문자에 해당하는 인덱스를 찾아보세요~
////		for(int i = 0;i < hello.length;i++) {
////			if(hello[i] == 'o') {
////				System.out.println(i);
////			}
////		}
//		
//		indexArray(hello);
//		String str = strArray(hello);
//		System.out.println(str);
	}

}