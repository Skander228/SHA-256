import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner( System.in );
            String word = scanner.nextLine();
            scanner.close();

            MessageDigest md5 = MessageDigest.getInstance("SHA-256");
            md5.update( word.getBytes("UTF-8") );
            byte[] bytes = md5.digest();

            for (byte b : bytes) {
                System.out.format("%02x", b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}