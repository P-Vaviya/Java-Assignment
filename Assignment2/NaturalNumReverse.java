import java.util.Scanner;

class NaturalNumReverse{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a num to print natural number : ");
        int num = myObj.nextInt();

        for(int i = num;i>=1;i--){
            System.out.println(i);
        }

        myObj.close();
    }
}