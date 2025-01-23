public class SwapTwoStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swap: str1 = " + str1 + ", str2 = " + str2);
        
        // Swapping logic
        str1 = str1 + str2; // Concatenate both strings
        str2 = str1.substring(0, str1.length() - str2.length()); // Get original str1
        str1 = str1.substring(str2.length()); // Get original str2
        
        System.out.println("After Swap: str1 = " + str1 + ", str2 = " + str2);
    }
}
