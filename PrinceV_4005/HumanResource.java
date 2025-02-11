class Employee{
    int id, salary;
    String name, department, date;

    Employee(int id, int salary, String name, String department, String date){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.date = date;
    }

    public String toString(){
        return ("Id : " + id + "\nName : " + name + "\nSalary : " + salary + "\nDepartment : " + department + "\ndate : " + date);
    }
}


class HumanResource{
    public static void main(String[] args){
        Employee e1 = new Employee(1, 2000, "Mr.Eagle", "Technical", "20/3/25");
        Employee e2 = new Employee(2, 1500, "Mr.Penguin", "Finance", "20/3/25");
        Employee e3 = new Employee(3, 1000, "Mr.Red", "Educational", "20/3/25");

        System.out.println(e1);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(e2);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(e3);
        System.out.println("----------------------------------------------------------------------------");
    }
}