package Lesson15;

import org.apache.log4j.Logger;

public class Logs {
    public static final Logger LOGGER = Logger.getLogger(Logs.class);
    public static void main(String[] args) {
        System.out.println();
        LOGGER.error("Error message");
    }
}
