package com.oop.finalexam.algorithms;

public class AlgorithmBinary implements Encryption, Decryption {
    private byte key;

    public byte getKey() {
        return key;
    }

    public void setKey(byte key) {
        this.key = key;
    }


    //Simple XOR operation over the byte array
    //01010111 01101001 01101011 01101001       plain text (first 4 bytes)
    //11110011 11110011 11110011 11110011       byte-long key
    //10100100 10011010 10011000 10011010       encrypted message

    public String encrypt(String plainText, byte key) {
        //Convert string to byte array
        //Apply XOR for every byte (8 bit)
        //Convert string to byte array

        //TODO Check links https://www.baeldung.com/java-bitwise-operators
        //TODO Check links https://examples.javacodegeeks.com/java-xor-operator-example/

        return null;
    }


    //Simple XOR in reverse order over byte array
    //10100100 10011010 10011000 10011010       decrypted message
    //11110011 11110011 11110011 11110011       byte-long (the same) key
    //01010111 01101001 01101011 01101001       plain text

    public String decrypt(String encryptedText, byte key) {
        //Simply, apply the same operation as in encrypt
        //Remember, XOR a value twice, will give initial result
        return null;
    }

}
