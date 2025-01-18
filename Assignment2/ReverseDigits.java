
import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a number to reverse it: ");
        String num1 = myObj.next(); 
        StringBuilder num2 = new StringBuilder();

        
        for (int i = num1.length() - 1; i >= 0; i--) {
            num2.append(num1.charAt(i)); 
        }

        myObj.close();
        System.out.println("Reversed number: " + num2.toString()); 
    }
}
