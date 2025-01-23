

class Average{
    public static void main(String[] args){

        double sum = 0, average = 0;
        double[] arr1 = {2.9, 1.0, 3.6, 3.3, 7.7};

        for(int i=0; i<5; i++){
            sum += arr1[i];
        }

        average = sum/5;

        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + average);

    }
}