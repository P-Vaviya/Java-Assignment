public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2};
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
