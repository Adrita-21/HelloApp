public class HelloApp {

    public static void main(String[] args) {
        String name;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString(); // Use the provided names
        } else {
            name = "World"; // Default value if no arguments are passed
        }

        System.out.println("Hello, " + name + "!");
    }
}