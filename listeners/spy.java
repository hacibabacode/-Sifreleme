package com.oop.finalexam.listeners;

import com.oop.finalexam.algorithms.AlgorithmBinary;
import com.oop.finalexam.algorithms.Decryption;

/**
 * 2.B Spy class as stated is a listener for the Encrypter class.
 * Assume that an object of type Spy passes a reference to the BinaryEncryption algorithm (described below)
 * when it registers itself with the Encrypter object.
 */
public class Spy implements Listener {
    //Define the key for listener class
    private static byte key = (byte) ((Math.random()*25)+1);
    public Decryption decryption = new AlgorithmBinary();

    public String update(String message) {
        //decryption.decrypt(message, key);

        return null;
    }

}
