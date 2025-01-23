public class RepeatCharacters {
    public static void main(String[] args) {
        String original = "abc";
        StringBuilder repeated = new StringBuilder();

        for (char c : original.toCharArray()) {
            repeated.append(c).append(c);
        }

        System.out.println("Repeated characters: " + repeated.toString());
    }
}
