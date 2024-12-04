package org.kem;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.KeyAgreement;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.AlgorithmParameterSpec;

public class SecureCommunicationExample {

    public static void main(String[] args) throws Exception {
        // Generate key pairs for Alice and Bob
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DH");
        keyPairGenerator.initialize(2048);
        
        KeyPair keyPairAlice = keyPairGenerator.generateKeyPair();
        KeyPair keyPairBob = keyPairGenerator.generateKeyPair();
        
        // Initialize Key Agreement for Alice
        KeyAgreement keyAgreementAlice = KeyAgreement.getInstance("DH");
        keyAgreementAlice.init(keyPairAlice.getPrivate());
        
        // Alice sends her public key to Bob
        
        // Initialize Key Agreement for Bob
        KeyAgreement keyAgreementBob = KeyAgreement.getInstance("DH");
        keyAgreementBob.init(keyPairBob.getPrivate());
        
        // Bob performs phase
        keyAgreementBob.doPhase(keyPairAlice.getPublic(), true);
        
        // Alice performs phase
        keyAgreementAlice.doPhase(keyPairBob.getPublic(), true);
        
        // Generate shared secrets
        byte[] sharedSecretAlice = keyAgreementAlice.generateSecret();
        byte[] sharedSecretBob = keyAgreementBob.generateSecret();
        
        // Verify shared secrets are equal
        System.out.println("Shared secret Alice: " + new String(sharedSecretAlice));
        System.out.println("Shared secret Bob: " + new String(sharedSecretBob));
    }
}
