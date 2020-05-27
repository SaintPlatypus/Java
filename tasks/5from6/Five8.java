import java.security.*;
import java.nio.charset.StandardCharsets;

/**
 * Five8
 */
public class Five8 {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        System.out.println(getSha256Hash("password123"));
    }
      private static String getSha256Hash(String h) throws NoSuchAlgorithmException{
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[]hash = digest.digest(h.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();//Т.к byte напрямую сделать стринг не могем, мы делаем следующие
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}