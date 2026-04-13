import java.util.Scanner;

public class SplitWithoutMethod {

    // Count length manually
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Split using charAt()
    public static String[] splitText(String str) {
        int length = findLength(str);

        // Count words
        int words = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        int start = 0, index = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || str.charAt(i) == ' ') {
                String word = "";

                for (int j = start; j < i; j++) {
                    word += str.charAt(j);
                }

                result[index++] = word;
                start = i + 1;
            }
        }

        return result;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(customSplit, builtInSplit);

        System.out.println("\nCustom Split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both same? " + result);
    }
}