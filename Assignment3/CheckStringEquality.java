public class CheckStringEquality {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");

        boolean isEqual = str1.equals(str2);
        System.out.println("Strings are equal: " + isEqual);
    }
}
