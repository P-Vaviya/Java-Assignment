import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the number to find : ");
        int num = myObj.nextInt();

        int[] arr1 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 77};

        for(int i = 0; i<arr1.length;){
            if (num == arr1[i]){
                System.out.print("Number was found at : " + i);
            break;
            }
            else{
                System.out.print("Number was not found");
                break;
            }
        }

        myObj.close();

        

    }
}