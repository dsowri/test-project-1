import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class VulnerableCode {

    public static void main(String[] args) {
        String password = null;
        // Intentionally passing null password to simulate vulnerability
        String hashedPassword = hashPassword(password);

        // Printing the hashed password
        System.out.println("Hashed Password: " + hashedPassword);
    }

    private static String hashPassword(String password) {
        // Simulating insecure password hashing
        return password.hashCode() + "";
    }
}
