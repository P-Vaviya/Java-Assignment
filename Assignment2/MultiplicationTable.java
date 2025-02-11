import java.util.Scanner;

class MultiplicationTable{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a num to print Multiplication Table : ");
        int num = myObj.nextInt();

        for(int i = 1;i <= 10 ; i++){
            System.out.print(num);
            System.out.print( " * ");
            System.out.print( i );
            System.out.print(" = ");
            System.out.print( num * i);
            System.out.println();
        } 

        myObj.close();
    }
}