//double → float → long → int → short → byte

class ExplicitConversion{
    public static void main(String args[]){
        // double d = 100.1;
        // int i = d;
        // System.out.println(i);
        //error: incompatible types: possible lossy conversion from double to int

        double d = 100.1;
        int i = (int)d;
        System.out.println(i);

    }
}