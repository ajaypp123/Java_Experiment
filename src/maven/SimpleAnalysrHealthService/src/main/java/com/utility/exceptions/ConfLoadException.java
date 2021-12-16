package com.utility.exceptions;

@SuppressWarnings("serial")
public class ConfLoadException extends Exception {
    public ConfLoadException (String str) {  
        // calling the constructor of parent Exception  
        super(str);  
    }
}
