import java.util.ArrayList;

class DuplicateElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 3};

        ArrayList<Integer> seen = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int num : numbers) {
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
