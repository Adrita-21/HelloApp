public class HelloApp {

    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Print the result
        System.out.println("Hello " + nameBuilder.toString());
    }
}