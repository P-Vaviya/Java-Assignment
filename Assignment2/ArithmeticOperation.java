import java.util.Scanner;

class ArithmeticOperation{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);



        do{

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division");
        System.out.println("5. Stop");
        System.out.print("Enter your option : ");
        int opt = myObj.nextInt();

        if(opt==5){
            break;}

        System.out.print("Enter first number : ");
        int num1 = myObj.nextInt();
        System.out.print("Enter second number : ");
        int num2 = myObj.nextInt();


        
        if(opt==1){
            System.out.println("Sum of number is : " + (num1 + num2));
        }
        if(opt==2){
            System.out.println("Difference of number is : " + (num1 - num2));
        }
        if(opt==3){
            System.out.println("Product of number is : " + (num1 * num2));
        }
        if(opt==4){
            System.out.println("Division of number is : " + (num1 / num2));
        }
        }
            
        
        while(true);
        myObj.close();
    }
}