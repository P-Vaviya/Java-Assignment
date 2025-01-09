import java.util.Scanner;

class VowelOrWhat{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the character : ");
        String S = myObj.next();
        char c = S.charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u' ){
            System.out.println("The character is Vowel ");
        }

        else{
            System.out.println("The character is Consonant ");
        }

        myObj.close();

    }
}