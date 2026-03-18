public class HelloApp {
    public static void main(String[] args) {

        String name = "";

        // Using StringBuilder to join all command-line arguments
        StringBuilder nameBuilder = new StringBuilder();

        for (String arg : args) {
            nameBuilder.append(arg).append(", ");
        }

        // Remove the last ", " if present
        if (nameBuilder.length() > 0) {
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        // Output message
        if (!name.isEmpty()) {
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}