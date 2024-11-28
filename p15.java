public class p15
{
    public static void main(String[] args)
    {
        String str = "aabbbcccddddeeeee";
        String longestRepeatingSequence = findLongestRepeatingSequence(str);
        System.out.println("Longest repeating sequence: " + longestRepeatingSequence);
    }

    public static String findLongestRepeatingSequence(String str) {
        int maxLength = 0;
        String longestRepeatingSequence = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String currentSequence = str.substring(i, j);
                int length = currentSequence.length();
                if (str.substring(j).contains(currentSequence) && length > maxLength) {
                    maxLength = length;
                    longestRepeatingSequence = currentSequence;
                }
            }
        }

        return longestRepeatingSequence;
    }
}


