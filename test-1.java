import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class VulnerableCode {

    public static void main(String[] args) {
        String password = null; // Intentionally passing null password to simulate vulnerability
        
        // Intentional vulnerability: Using weak hashing algorithm
        String hashedPassword = hashPasswordMD5(password);

        // Intentional vulnerability: Printing sensitive information
        System.out.println("Hashed Password: " + hashedPassword);
    }

    // Intentional vulnerability: Using weak hashing algorithm (MD5)
    private static String hashPasswordMD5(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
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
