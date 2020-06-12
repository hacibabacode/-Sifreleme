package com.oop.finalexam;

import com.oop.finalexam.algorithms.Encryption;
import com.oop.finalexam.listeners.Listener;

import java.util.ArrayList;
import java.util.List;

public class Encrypter {
    // 1.A Has a list of references to encryption algorithms.
    private List <Encryption> algs = new ArrayList();

    //1.B Has a list of references to its listeners (those listening for encrypted messages
    //from the Encrypter class), there are two listener classes for this project (General and Spy described below).
    private List <Listener> listeners = new ArrayList();

    //1.C Has a method called register that takes three arguments: a reference to an encryption algorithm,
    //the key that should be used with the encryption algorithm and a reference to a listener
    public void register(Encryption encryption, String key, Listener listener){
        //fill up listener and encryption reference arrays

    }

    //1.D Has a method sendAll that send the encrpyted message to all its listeners (of course each
    //message is encrypted with the algorithm and the key the listener sent before with registration).
    private void sendAll(){

        //When the Encrypter object wants to send a message (to all its listeners), it first obtains the plain text from a file given to it and encrypts the message in it using an encryption algorithm


        //Read messages from json file. It is much easier than parsing a text file. Check below url for how to use it. Also, check maven dependency that fetches JSONObject jar file
        //TODO https://devqa.io/how-to-parse-json-in-java/
        //TODO before starting the project, run "maven clean install"

        for(Listener listener: listeners){
            listener.update("");
        }
    }
}
