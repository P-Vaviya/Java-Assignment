import java.util.Scanner;

class SumofDigits{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter number to print digits sum : ");
        int num1 = myObj.nextInt();
        int num2 = 0;
        int n = 0;

        while(num1 != 0){
            n = num1%10;
            num1 = num1/10;
            num2 += n;
        }
        System.out.println(num2);
        myObj.close();
    }
}