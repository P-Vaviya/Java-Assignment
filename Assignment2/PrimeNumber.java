import java.util.Scanner;

class PrimeNumber{
    public static void main(String args[]){
        Scanner myObj = new Scanner (System.in);

        System.out.print("Enter a number to check prime number : ");
        int num1 = myObj.nextInt();

        for(int i = 2; i< Math.sqrt(num1);){
            if(num1 % i == 0){
                System.out.print("It is not a prime number ");
                break;
            }
            else{
                System.out.print("It is a prime number ");
                break;

            }
        }
        myObj.close();
    }
}