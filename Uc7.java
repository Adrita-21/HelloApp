public class HelloApp {
    public static void main(String[] args) {

        String names = "World";

        // If arguments are provided, join them with comma
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}