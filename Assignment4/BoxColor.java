class Box{
    private int length, width, height;
    Box(){
        System.out.println("SuperClass Constructor");
    }
}


class BoxWt extends Box{

    private int weight;

    BoxWt(){
        super();
        this.weight = 5;
    }

    BoxWt(int weight){
        this.weight = weight;
    }

    BoxWt(BoxWt obj){
        this.weight = obj.weight;
    }

    public void print_BoxWt(){
        System.out.println("The weight of the box is : " + weight);
    }
}

class BoxColor extends BoxWt{
    private String color;
    
    public static void main(String[] args){
        BoxWt bw = new BoxWt();
        bw.print_BoxWt();
        BoxWt bw2 = new BoxWt(25);
        bw2.print_BoxWt();
        BoxWt bw3 = new BoxWt(bw2);
        bw3.print_BoxWt();
    }
}