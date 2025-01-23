public class CountWordsInString {
    public static void main(String[] args) {
        String sentence = "Hello world, this is Java";
        String[] words = sentence.split("\\s+");
        
        System.out.println("Number of words: " + words.length);
    }
}
