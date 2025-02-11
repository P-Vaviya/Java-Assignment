class Rectangle{

    private float length = 1.0f,width = 1.0f;

    public Rectangle(){
        System.out.println("Default");
    }

    public Rectangle(float length, float width){
        System.out.println("Parametrized");
    }

    public float getlength(){
        return length;
    }

    public void setlength(float length){
        this.length = length;
    }

    public float getwidth(){
        return width;
    }

    public void setwidth(float width){
        this.width = width;
    }

    public float getArea(){
        return (length * width);
    }

    public float getPerimeter(){
        return (2*length + 2*width);
    }

    public String toString(){
        return ("The Rectangle : " + " Length : " + length + " Width : " + width);
    }


    public static void main(String[] args){

        Rectangle r1 = new Rectangle();
        System.out.println("The length of rectangle : " + r1.getlength());
        System.out.println("The width of rectangle : " + r1.getwidth());
        System.out.println("The area of rectangle : " + r1.getArea());
        System.out.println("The perimeter of rectangle : " + r1.getPerimeter());
        System.out.println(r1);

    }
}