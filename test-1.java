import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class VulnerableCode {

    public static void main(String[] args) {
        String password = null; // Intentionally passing null password to simulate vulnerability
        
        // Intentional vulnerability: Using weak hashing algorithm
        String hashedPassword = hashPasswordSHA256(password);

        // Intentional vulnerability: Printing sensitive information
        System.out.println("Hashed Password: " + hashedPassword); // Insecure output of sensitive information
    }

    // Intentional vulnerability: Using weak hashing algorithm (SHA-256)
    private static String hashPasswordSHA256(String password) {
        if (password == null) {
            // Intentional vulnerability: Handling of null passwords
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); // Using stronger hashing algorithm
            md.update(password.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
