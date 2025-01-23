import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        int[] originalArray = {10, 20, 30, 40, 50};
        System.out.print("Enter index to remove : ");
        int index = myObj.nextInt() ;

        System.out.println("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        if (index < 0 || index >= originalArray.length) {
            System.out.println("Invalid index");
            return;
        }

        int[] newArray = new int[originalArray.length - 1];

        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i != index) {
                newArray[j++] = originalArray[i];
            }
        }

        System.out.println("New Array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
