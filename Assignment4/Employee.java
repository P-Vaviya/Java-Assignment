class Employee{

    private int ID, salary;
    private String firstName;
    private String lastName;

    public Employee(int ID, String firstName, String lastName, int salary){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID(){
        return ID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return (firstName + " " + lastName);
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return (salary * 12);
    }

    public int raiseSalary(int percent){
        return (salary + (salary*percent)/100);
    }

    public String toString(){
        return (" ID : " + ID + "\n Name : " + firstName + " " + lastName + " " + "\n Salary : " + salary);
    }

    public static void main(String[] args){
        Employee e1 = new Employee(005, "Mr.", "Eagle",100);
        System.out.println(e1);
        System.out.println(e1.raiseSalary(50));

    }
}