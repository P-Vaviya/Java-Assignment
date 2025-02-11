class sumex1{
    public String sum(int num1, int num2){
        return (num1 + num2 + " : Sum of two integers ");
    }
    public String sum(int num1, int num2, int num3){
        return (num1 + num2 + num3 + " : Sum of three integers ");
    }
    public String sum(double num1, double num2){
        return (num1 + num2 + " : Sum of two doubles ");
    }
    public String sum(double num1, double num2, double num3){
        return (num1 + num2 + num3 + " : Sum of three doubles ");
    }

    public static void main(String[] args){
        sumex1 s = new sumex1();
        System.out.println(s.sum(1, 2));
        System.out.println(s.sum(1, 2, 3));
        System.out.println(s.sum(1.0, 2.0));
        System.out.println(s.sum(1.0, 2.0, 3.0));
    }
}