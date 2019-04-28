package com.devflection.jars.packages.first;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstClass {

    private static final Logger logger = LoggerFactory.getLogger(FirstClass.class);

    public static void helloWorldFromTheFirstClass() {
        String message = StringUtils.capitalize("hello world! First class sure is enjoyable...");
        logger.info(message);
    }
}
