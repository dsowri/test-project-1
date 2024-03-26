public class VulnerableCode {

    public static void main(String[] args) {
        String username = null;
        String greeting = "Hello, ";

        // Concatenating username to greeting
        String message = greeting + username;

        // Printing the message
        System.out.println(message);
    }
}
