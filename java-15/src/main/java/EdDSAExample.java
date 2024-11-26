import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;

public class EdDSAExample {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("Ed25519");
        KeyPair pair = keyGen.generateKeyPair();

        Signature sig = Signature.getInstance("Ed25519");
        sig.initSign(pair.getPrivate());
        sig.update("Hello, World!".getBytes());

        byte[] signature = sig.sign();
        System.out.println("Signature: " + new String(signature));

        sig.initVerify(pair.getPublic());
        sig.update("Hello, World!".getBytes());
        boolean isVerified = sig.verify(signature);
        System.out.println("Verified: " + isVerified);  // Output: Verified: true
    }
}
