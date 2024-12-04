package org.kem;

import java.security.*;
import javax.crypto.KeyAgreement;

public class KEMExample {

    public static void main(String[] args) throws Exception {
        // Generate key pairs for two parties
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DH");
        keyPairGenerator.initialize(2048);
        
        KeyPair keyPairA = keyPairGenerator.generateKeyPair();
        KeyPair keyPairB = keyPairGenerator.generateKeyPair();
        
        // Initialize Key Agreement
        KeyAgreement keyAgreementA = KeyAgreement.getInstance("DH");
        keyAgreementA.init(keyPairA.getPrivate());
        
        KeyAgreement keyAgreementB = KeyAgreement.getInstance("DH");
        keyAgreementB.init(keyPairB.getPrivate());
        
        // Generate shared secret
        keyAgreementA.doPhase(keyPairB.getPublic(), true);
        keyAgreementB.doPhase(keyPairA.getPublic(), true);
        
        byte[] sharedSecretA = keyAgreementA.generateSecret();
        byte[] sharedSecretB = keyAgreementB.generateSecret();
        
        // Display shared secrets
        System.out.println("Shared secret A: " + new String(sharedSecretA));
        System.out.println("Shared secret B: " + new String(sharedSecretB));
    }
}
