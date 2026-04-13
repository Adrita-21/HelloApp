import java.util.Scanner;

public class CharArrayCompare {

    // Return characters manually
    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    // Compare two char arrays
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        char[] arr1 = getChars(str);
        char[] arr2 = str.toCharArray();

        boolean result = compareArrays(arr1, arr2);

        System.out.println("Are both arrays same? " + result);
    }
}w