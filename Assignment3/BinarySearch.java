import java.util.Scanner;

class BinarySearch{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9};
        int n = arr.length;

        System.out.print("Enter a number to search : ");
        int num = myObj.nextInt();
        myObj.close();

        int result = -1, low = 0, high = n-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(num == arr[mid]){
                result = mid;
                break;
            }
            else if(num>=arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(result == -1){
            System.out.println("The element was not found ");
        }
        else{
            System.out.println("The element was found ");
        }

    }
}