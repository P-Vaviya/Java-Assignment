import java.util.Scanner;

class StudentsGrades{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter your grades : ");
        int grade = myObj.nextInt();

        grade = grade/10;

        switch (grade){
            case (9):
                System.out.println("A Grade , Congrats !!!");
                break;
            case (8):
                System.out.println("B Grade :)");
                break;
            case (7):
                System.out.println("C Grade :)");
                break;
            case (6):
                System.out.println("D Grade , next time Study well , you have potential");
                break;
            case (5):
                System.out.println("E grade , Do hardwork next time :( ");
                break;
            default : 
                System.out.println("F grade , meet me in the principal office ");

        }

        myObj.close();

    }
}