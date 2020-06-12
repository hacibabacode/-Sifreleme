package com.oop.finalexam.listeners;

import com.oop.finalexam.algorithms.Decryption;
import com.oop.finalexam.algorithms.AlgorithmShift;

/**
 * 2.A General class as stated is a listener for the Encrypter class.
 * Assume that an object of type General passes a reference to the Shift Encryption algorithm (described below)
 * when it registers itself with the Encrypter object.
 */
public class General implements Listener {
    private static byte key = (byte) ((Math.random()*25)+1);
    public Decryption decryption = new AlgorithmShift();

    //General and Spy (listeners for the Encrypt) classes have a reference to a decryption algorithm of type Decryption
    public String update(String message) {
        decryption.decrypt(message, key);
        return null;
    }



}
