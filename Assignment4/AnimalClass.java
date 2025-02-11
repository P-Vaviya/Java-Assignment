class Animal{
    private boolean vegetarian;
    private String food;
    private int numOfLegs;

    Animal(){
        this.vegetarian = true;
        this.food = "grass";
        this.numOfLegs = 4;

    }

    Animal(boolean vegetarian, String food, int numOfLegs){
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }

    public String toString(){
        return ("Vegetarian : " + vegetarian + "\nfood : " + food + "\nnumOfLegs : " + numOfLegs);
    }

    public boolean getVegetarian(){
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }

    public String getFood(){
        return food;
    }

    public void setFood(String food){
        this.food = food;
    }

    public int getNumOfLegs(){
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs){
        this.numOfLegs = numOfLegs;
    }
}

class Cow extends Animal{
    private String breed;

    Cow(){
        super();
        this.breed = "desi";

    }

    Cow(boolean vegetarian, String food, int numOfLegs, String breed){
        super(vegetarian, food, numOfLegs);
        this.breed = breed;
    }

    public String toString(){
        return (super.toString() + "\nbreed : " + breed);
    }
}

class Cat extends Animal{
    private String color;

    Cat(){
        super();
        this.color = "orange";

    }

    Cat(boolean vegetarian, String food, int numOfLegs, String color){
        super(vegetarian, food, numOfLegs);
        this.color = color;
    }

    public String toString(){
        return (super.toString() + "\ncolor : " + color);
    }
}

class AnimalClass{
    public static void main(String[] args){
        Cat c1 = new Cat(true, "grape", 4, "cyan");
        System.out.println(c1);

        Cow c2 = new Cow(true, "grass", 4, "desi");
        System.out.println(c2);  

    }}