public class CountUppercaseLowercase {
    public static void main(String[] args) {
        String input = "Hello World!";
        
        int upperCount = 0;
        int lowerCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) upperCount++;
            else if (Character.isLowerCase(c)) lowerCount++;
        }

        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
    }
}
