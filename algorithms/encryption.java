package com.oop.finalexam.algorithms;


//3. Have an interface called Encyrption with one method called String encrypt(String plainText, byte key) that is implemented by two concrete encryption algorithms...
public interface Encryption {
    String encrypt(String plainText, byte key);
}
