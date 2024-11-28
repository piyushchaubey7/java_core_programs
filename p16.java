public class p16 {
    public static void main(String[] args) {
        String input = "Hello World 123";

        String converted = convertCase(input);
        System.out.println("Original: " + input);
        System.out.println("Converted: " + converted);
    }

    public static String convertCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            }
        }

        return new String(charArray);
    }
}
