package com.utility.loglib.handler;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class CustomStreamHandler extends StreamHandler{
    @Override
    public synchronized void publish(LogRecord record) {
        // TODO Auto-generated method stub
        super.publish(record);
    }

    @Override
    public synchronized void flush() {
        // TODO Auto-generated method stub
        super.flush();
    }

    @Override
    public synchronized void close() throws SecurityException {
        // TODO Auto-generated method stub
        super.close();
    }
}