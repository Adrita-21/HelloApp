import java.util.Random;

class FootballTeamHeights {

    // Method to calculate sum
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Method to calculate mean
    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }

        // Display heights
        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Results
        System.out.println("\nMean Height: " + findMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}