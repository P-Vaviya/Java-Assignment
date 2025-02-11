class Incre_Decre_Operators {
    public static void main(String args[]) {
        //post-increment operator
        int a = 20;
        int b = a++;
        //pre-increment operator
        int c = 30;
        int d = ++c;

        System.out.println("post increment for 20 : " + b);
        System.out.println("pre increment for 30 : " + d);

//------------------------------------------------------------//----------------------------------------------------//

        //post-decrement operator
        int num1 = 20;
        int num2 = num1--;
        //pre-decrement operator
        int num3 = 30;
        int num4 = --num3;

        System.out.println("post decrement for 20 : " + num2);
        System.out.println("pre decrement for 30 : " + num4);
    }
}