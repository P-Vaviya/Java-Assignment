import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String args[]){
        Scanner myObj = new Scanner (System.in);

        System.out.print("Enter a number to check Armstrong number : ");
        int num1 = myObj.nextInt();
        int n, num2 = 0;
        int original = num1;

        int len = String.valueOf(num1).length();


        while(num1 != 0){
            n = num1%10;
            num1 = num1/10;
            num2 = num2 + (int)Math.pow(n, len);
        }

        if(num2 == original){
            System.out.print("It is Armstrong number ");
        }
        else{
            System.out.print("It is not Armstrong number ");
        }




    }
}