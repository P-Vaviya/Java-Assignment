public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        int result = str1.compareToIgnoreCase(str2);
        if (result < 0) {
            System.out.println("String 1 is less than String 2");
        } else if (result == 0) {
            System.out.println("String 1 is equal to String 2");
        } else {
            System.out.println("String 1 is greater than String 2");
        }
    }
}
