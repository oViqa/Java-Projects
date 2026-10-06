import java.util.Base64; // for Base64.getEncoder() and Base64.getDecoder()
import java.nio.charset.StandardCharsets;

public class Base64Codec    {
    public static String encode (String input)    {
        byte[] bytes    =   input.getBytes(StandardCharsets.UTF_8);
        return Base64.getEncoder().encodeToString(bytes);
    }
    public static String decode (String input)
        {
            byte[] decodeBytes = Base64.getDecoder().decode(input);

            return new String(decodeBytes, StandardCharsets.UTF_8);
        }

    public static void main(String[] args) {

        String original = "Hi";

        String encoded = Base64Codec.encode(original);
        String decoded = Base64Codec.decode(encoded);

        System.out.println("Original: " + original);
        System.out.println("Encoded:  " + encoded);
        System.out.println("Decoded:  " + decoded);
    }
}