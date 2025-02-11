import java.util.Scanner;

class Insert{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the number to insert : ");
        int ele = myObj.nextInt();

        System.out.print("Enter the index to insert at : ");
        int index = myObj.nextInt();

        int[] arr1 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 77};

        System.out.println("Element before insertion : " + arr1[index]);

        arr1[index] = ele;

        System.out.println("Element after insertion : " + arr1[index]);

        myObj.close();





        

    }
}