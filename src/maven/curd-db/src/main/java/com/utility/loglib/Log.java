package com.utility.loglib;

import java.util.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;

/*
 * Log is utility class to provide wrapper around Logger.
 * Log in java can be manage by two ways
 * 1. log.properties
 *       - Which need LogManager reading log.properties
 * 2. Class
 *      - Which need to set log handler, filter, formatter by class
 *
 * Parameter:
 * LOG_NAME = Log.class.getName()
 * NOG_LEVEL = LEVEL
*/
public class Log {
    private static boolean initCheck;
    private static Logger lg;

    /*
     * Constructor for Log class Log level in java are 1. SEVERE (highest) 2.
     * WARNING 3. INFO 4. CONFIG 5. FINE 6. FINER 7. FINEST 8. ALL 9. OFF
     */
    private Log() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * @param logName: Name of log logFile: File to redirect
     */
    public static void init() {
        try {
            if (Log.initCheck) {
                throw new SecurityException("Log is already initialized.");
            } else {
                Log.initCheck = true;
            }
            String file = "log.properties";
            Log.lg = Logger.getLogger(Log.class.getName());
            // InputStream in = Files.newInputStream(Paths.get(file)); // Use if file not in resource Eg: /etc/curd/log.properties
            InputStream in = Log.class.getClassLoader().getResourceAsStream(file);
            LogManager.getLogManager().readConfiguration(in);
        } catch (SecurityException | IOException e1) {
            e1.printStackTrace();
        }
    }

    public static void server(String logMsg){
        Log.lg.log(Level.SEVERE, logMsg);
    }

    public static void info(String logMsg){
        Log.lg.log(Level.INFO, logMsg);
    }

    public static void warning(String logMsg){
        Log.lg.log(Level.WARNING, logMsg);
    }

    public static void off(String logMsg){
        Log.lg.log(Level.OFF, logMsg);
    }

    public static void all(String logMsg){
        Log.lg.log(Level.ALL, logMsg);
    }

    public static void finest(String logMsg){
        Log.lg.log(Level.FINEST, logMsg);
    }

    public static void finer(String logMsg){
        Log.lg.log(Level.FINER, logMsg);
    }

    public static void fine(String logMsg){
        Log.lg.log(Level.FINE, logMsg);
    }

    public static void config(String logMsg){
        Log.lg.log(Level.CONFIG, logMsg);
    }

    /* // To handle log by class method

    private void setLog() {
        this.lg.setLevel(Level.ALL);
    }

    private void setLogHandler() {
        try {
            //FileHandler file name with max size and number of log files limit
            Handler fileHandler = new FileHandler("/tmp/logger.log", 2000, 5);
            fileHandler.setFormatter(new CustomLogFormatter());
            //setting custom filter for FileHandler
            fileHandler.setFilter(new CustomLogFilter());
            this.lg.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }
    */
}