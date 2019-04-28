package com.devflection.jars.packages.second;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EconomyClass {

    private static final Logger logger = LoggerFactory.getLogger(EconomyClass.class);

    public static void helloWorldFromTheEconomyClass() {
        String message = StringUtils.capitalize("hello world! Economy class sure is crowded and unpleasant...");
        logger.info(message);
    }

}
