public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println();

        System.out.println("1. Length of the string: " + str.length());
        System.out.println();

        System.out.println("2. Character at index 7: " + str.charAt(7));
        System.out.println();

        System.out.println("3. Index of 'o': " + str.indexOf('o'));
        System.out.println();

        System.out.println("4. Index of 'o' from index 5: " + str.indexOf('o', 5));
        System.out.println();

        System.out.println("5. Index of 'World': " + str.indexOf("World"));
        System.out.println();

        System.out.println("6. Index of 'o' from index 5: " + str.indexOf("o", 5));
        System.out.println();

        System.out.println("7. Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println();

        System.out.println("8. Substring from index 7: " + str.substring(7));
        System.out.println();

        System.out.println("9. Substring from index 7 to 12: " + str.substring(7, 12));
        System.out.println();

        System.out.println("10. Contains 'World': " + str.contains("World"));
        System.out.println();

        String newStr = str.concat(" How are you?");
        System.out.println("11. Concatenated string: " + newStr);
        System.out.println();

        System.out.println("12. Equals 'Hello, World!': " + str.equals("Hello, World!"));
        System.out.println();

        System.out.println("13. Equals ignore case 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));
        System.out.println();

        System.out.println("14. Is string empty: " + str.isEmpty());
        System.out.println();

        System.out.println("15. Lowercase string: " + str.toLowerCase());
        System.out.println();

        System.out.println("16. Uppercase string: " + str.toUpperCase());
        System.out.println();

        System.out.println("17. Compare to 'Hello, World!': " + str.compareTo("Hello, World!"));
        System.out.println();

        System.out.println("18. Compare to ignore case 'HELLO, WORLD!': " + str.compareToIgnoreCase("HELLO, WORLD!"));
        System.out.println();

        String spacedStr = "   Hello, World!   ";
        System.out.println("19. Trimmed string: '" + spacedStr.trim() + "'");
        System.out.println();

        System.out.println("20. String after replacing 'o' with '0': " + str.replace('o', '0'));
        System.out.println();

        char[] charArray = str.toCharArray();
        System.out.print("21. Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        
        System.out.println();

        System.out.println("22. Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println();

        System.out.println("23. Ends with '!': " + str.endsWith("!"));
        System.out.println();

        String joinedStr = String.join(", ", "Java", "Python", "C++");
        System.out.println("24. Joined string: " + joinedStr);
        System.out.println();
    }
}
