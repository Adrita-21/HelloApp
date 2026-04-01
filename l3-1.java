import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, temp, count = 0;

        // Input
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        temp = number;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Frequency array (0–9 digits)
        int[] freq = new int[10];

        // Calculate frequency
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Display result
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}