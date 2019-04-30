package com.devflection.jars;

import com.devflection.jars.packages.first.FirstClass;
import com.devflection.jars.packages.second.EconomyClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Hello from the logger! This is our sample JAR project.");

        FirstClass.helloWorldFromTheFirstClass();
        EconomyClass.helloWorldFromTheEconomyClass();
    }
}
