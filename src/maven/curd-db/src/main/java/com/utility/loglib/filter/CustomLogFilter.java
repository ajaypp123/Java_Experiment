package com.utility.loglib.filter;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomLogFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord log) {
        //don't log CONFIG logs in file
        if(log.getLevel() == Level.CONFIG) {
            return false;
        } else {
            return true;
        }
    }

}