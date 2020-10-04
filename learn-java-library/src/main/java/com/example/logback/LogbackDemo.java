package com.example.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://www.marcobehler.com/guides/a-guide-to-logging-in-java
 * https://sematext.com/blog/java-logging/
 */
public class LogbackDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        System.out.println("Start logging with Logback in Java.");

        LOGGER.trace("This is a TRACE example in Backlog framework");
        LOGGER.debug("This is a DEBUG example in Backlog framework");
        LOGGER.info("This is an INFO example in Backlog framework");
        LOGGER.warn("This is a WARNING example in Backlog framework");
        LOGGER.error("This is an ERROR example in Backlog framework");

        System.out.println("End of application running.");
    }
}
