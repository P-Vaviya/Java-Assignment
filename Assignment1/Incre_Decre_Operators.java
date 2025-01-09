import java.util.Scanner;

class Incre_Decre_Operators {
    public static void main(String args[]) {
        //post-increment operator
        int a = 20;
        int b = a++;
        //pre-increment operator
        int c = 30;
        int d = ++c;

        System.out.println(b);
        System.out.println(d);
    }
}