import java.util.Scanner;

public class FriendsDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Finding youngest
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Finding tallest
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest friend: " + names[minAgeIndex] +
                " (Age: " + age[minAgeIndex] + ")");

        System.out.println("Tallest friend: " + names[maxHeightIndex] +
                " (Height: " + height[maxHeightIndex] + " cm)");

        sc.close();
    }
}