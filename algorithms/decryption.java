package com.oop.finalexam.algorithms;

//4. Have an interface called Decryption with one method called String decrypt(String encryptedText, byte key) that is implemented by two concrete decryption algorithms...
public interface Decryption {
    String decrypt(String encryptedText, byte key);
}
