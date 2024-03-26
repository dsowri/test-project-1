public class VulnerableCode {

    public static void main(String[] args) {
        String password = null;
        String hashedPassword = hashPassword(password);

        // Printing the hashed password
        System.out.println("Hashed Password: " + hashedPassword);
    }

    private static String hashPassword(String password) {
        // Simulating password hashing
        return password.hashCode() + "";
    }
}
