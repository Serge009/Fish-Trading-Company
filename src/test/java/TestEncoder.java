import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by SERGE on 09.11.2014.
 */
public class TestEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPass = encoder.encode("admin");
        System.out.println(hashedPass);
        System.out.println(hashedPass.length());
    }
}
