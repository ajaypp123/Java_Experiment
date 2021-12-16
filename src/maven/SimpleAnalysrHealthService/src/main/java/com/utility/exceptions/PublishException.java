package com.utility.exceptions;

@SuppressWarnings("serial")
public class PublishException extends Exception {
    public PublishException (String str) {  
        // calling the constructor of parent Exception  
        super(str);  
    }
}