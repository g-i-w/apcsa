import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;

public class TestSHA256 {
	public static void main (String[] args) throws Exception {
		String originalString = "this is some text";

		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] encodedhash = digest.digest(originalString.getBytes());

		System.out.println( new String(encodedhash) );
	}
}