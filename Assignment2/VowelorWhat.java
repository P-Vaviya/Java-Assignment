import java.util.Scanner;

class VowelorWhat{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a character to check : ");
        char ch = myObj.next().charAt(0);

        switch(ch){
            case 'a':
                System.out.println("It is Vowel");
                break;
            case 'e':
                System.out.println("It is Vowel");
                break;
            case 'i':
                System.out.println("It is Vowel");
                break;
            case 'o':
                System.out.println("It is Vowel");
                break;
            case 'u':
                System.out.println("It is Vowel");
                break;
            default:
                System.out.println("It is consonant");
                break;
        }
    }
}