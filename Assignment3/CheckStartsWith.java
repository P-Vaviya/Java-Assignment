public class CheckStartsWith {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String prefix = "Hello";

        boolean startsWith = str1.startsWith(prefix);
        System.out.println("Starts with '" + prefix + "': " + startsWith);
    }
}
