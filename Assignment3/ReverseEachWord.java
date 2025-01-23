public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Hello World";
        
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            reversedSentence.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println("Reversed each word: " + reversedSentence.toString().trim());
    }
}
