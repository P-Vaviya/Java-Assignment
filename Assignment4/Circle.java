class Circle{

    private double radius = 1.0;

    public Circle(){
        System.out.println("Default");

    }

    public Circle(double radius){
        System.out.println("Parametrized");
    }

    public double getRadius(){
        return radius;
    }
    public double calculateArea(){
        return (Math.PI * radius * radius);
    }
    public double calculateCircum(){
        return (2 * Math.PI * radius);
    }


    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("The radius of the circle : " + c1.getRadius());
        System.out.println("The area of the circle : " + c1.calculateArea());
        System.out.println("The circumference of the circle : " + c1.calculateCircum());

    }
}