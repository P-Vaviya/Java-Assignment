public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "madam";
        
        boolean isPalindrome = new StringBuilder(input).reverse().toString().equals(input);
        
        System.out.println(input + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
    }
}
