import java.util.ArrayList;
import java.util.List;

public class p14 {
    public static void main(String[] args) {
        String str = "abc";
        List<String> subsets = generateSubsets(str);

        System.out.println("Subsets of the string " + str + ": ");
        for (String subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<String> generateSubsets(String str) {
        List<String> subsets = new ArrayList<>();
        generateSubsetsHelper(str, 0, "", subsets);
        return subsets;
    }

    private static void generateSubsetsHelper(String str, int index, String current, List<String> subsets) {
        if (index == str.length()) {
            subsets.add(current);
            return;
        }

        // Include the current character
        generateSubsetsHelper(str, index + 1, current + str.charAt(index), subsets);

        // Exclude the current character
        generateSubsetsHelper(str, index + 1, current, subsets);
    }
}















