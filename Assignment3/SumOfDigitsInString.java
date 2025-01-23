public class SumOfDigitsInString {
    public static void main(String[] args) {
        String input = "abc123def456";
        int sum = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}
