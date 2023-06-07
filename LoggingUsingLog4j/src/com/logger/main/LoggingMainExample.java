package com.logger.main;

import java.util.logging.Logger;

public class LoggingMainExample {
    static Logger logger = Logger.getLogger(String.valueOf(LoggingMainExample.class));
    public static void main(String[] args) {

        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
        logger.fatal("This is fatal message");
        logger.error("This is error message");

        System.out.println("Logic executed successfully....");

    }
}
