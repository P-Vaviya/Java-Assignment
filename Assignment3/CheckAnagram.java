import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean isAnagram = Arrays.equals(charArray1, charArray2);

        System.out.println(s1 + (isAnagram ? " and " : " and not ") + s2 + (isAnagram ? " are anagrams." : " are not anagrams."));
    }
}
