import java.util.Scanner;

public class Count{
    public static void main(String args[]){
        String s;
        int i;
        int consonant = 0;
        int vowel = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요.: ");
        s = scan.nextLine();
            for(i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'a':
                    vowel++;
                    break;
                case 'e':
                    vowel++;
                    break;
                case 'i':
                    vowel++;
                    break;
                case 'o':
                    vowel++;
                    break;
                case 'u':
                    vowel++;
                    break;
                default :
                    consonant++;
                    break;
            }
        }
        
        System.out.print("자음의 개수: " + consonant + "\n모음의 개수: " + vowel);
    }
}