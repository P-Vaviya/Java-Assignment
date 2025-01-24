import java.util.ArrayList;

public class Stringval {
    public static void main(String[] args) {
        String[] numbers = {"apple", "banana", "apple", "pineapple", };

        ArrayList<String> seen = new ArrayList<>();
        ArrayList<String> duplicates = new ArrayList<>();

        for (String num : numbers) {
            if (seen.contains(num)) {
                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                }
            } else {
                seen.add(num);
            }
        }

        System.out.println("Duplicate Values: " + duplicates);
    }
    }
