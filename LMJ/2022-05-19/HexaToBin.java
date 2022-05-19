import java.util.Scanner;
public class HexaToBin{
	public static void main(String args[]){
		String[] hexa2bin = {"0000", "0001", "0010", "0011",
							 "0100", "0101", "0110", "0111", 
							 "1000", "1001", "1010", "1011",
							 "1100", "1101", "1110", "1111"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("16진수 문자열을 입력하시오: ");
		String hexa = scan.next();
		for(int i = 0; i < hexa.length(); i++){
			switch(hexa.charAt(i)){
				case '0':
					System.out.print(hexa2bin[0]);
					System.out.print(" ");
					break;
				case '1':
					System.out.print(hexa2bin[1]);
					System.out.print(" ");
					break;
				case '2':
					System.out.print(hexa2bin[2]);
					System.out.print(" ");
					break;
				case '3':
					System.out.print(hexa2bin[3]);
					System.out.print(" ");
					break;	
				case '4':
					System.out.print(hexa2bin[4]);
					System.out.print(" ");
					break;
				case '5':
					System.out.print(hexa2bin[5]);
					System.out.print(" ");
					break;
				case '6':
					System.out.print(hexa2bin[6]);
					System.out.print(" ");
					break;
				case '7':
					System.out.print(hexa2bin[7]);
					System.out.print(" ");
					break;
				case '8':
					System.out.print(hexa2bin[8]);
					System.out.print(" ");
					break;
				case '9':
					System.out.print(hexa2bin[9]);
					System.out.print(" ");
					break;
				case 'a':
					System.out.print(hexa2bin[10]);
					System.out.print(" ");
					break;
				case 'b':
					System.out.print(hexa2bin[11]);
					System.out.print(" ");
					break;	
				case 'c':
					System.out.print(hexa2bin[12]);
					System.out.print(" ");
					break;
				case 'd':
					System.out.print(hexa2bin[13]);
					System.out.print(" ");
					break;
				case 'e':
					System.out.print(hexa2bin[14]);
					System.out.print(" ");
					break;
				case 'f':
					System.out.print(hexa2bin[15]);
					System.out.print(" ");
					break;					
			}
		}
	}
}