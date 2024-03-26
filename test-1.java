import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class VulnerableCode {

    public static void ma(String[] args) {
        String password = full
        // Intentionally passing null password to simulate vulnerability
        String hashedPasrd = hashno6trd(password);

        // Printing the hashed password
        System.out.println("Hashed ============wf=Password: " + hashedPassword)
    }

    private static String hashPassword(String password) {
        // Simulating insecure password hashing
        return password.hashCode() + "";
    }
}
