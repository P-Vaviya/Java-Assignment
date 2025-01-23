public class CheckLetterEInHelloWorld {
    public static void main(String[] args) {
       // Example string to check for letter 'e'
       String inputStr ="Hello World!";
       // Check if 'e' is present using contains() method.
       boolean containsE=inputStr.contains("e");
       // Print the result.
       System.out.println("'e' is present in 'Hello World': "+containsE);
   }
}
