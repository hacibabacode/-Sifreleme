package com.oop.finalexam.algorithms;

public class AlgorithmShift implements Encryption, Decryption {
    private byte key;

    public byte getKey() {
        return key;
    }

    public void setKey(byte key) {
        this.key = key;
    }

    //encryptedText:"the attack will start at five am" , key:1
    //returns "uif buubdl xjmm tubsu bu gjwf bn"
    public String encrypt(String plainText, byte key) {
        return null;
    }

    //encryptedText: "uif buubdl xjmm tubsu bu gjwf bn", key:1 (in this case -1)
    //returns "the attack will start at five am"
    public String decrypt(String encryptedText, byte key) {
        return null;
    }
}
