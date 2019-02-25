package com.devflection.jars;

import com.devflection.jars.packages.first.FirstClass;
import com.devflection.jars.packages.second.EconomyClass;

public class App {

    public static void main(String[] args) {
        System.out.println("This is out sample JAR project.");

        new FirstClass().helloWorldFromTheFirstClass();
        new EconomyClass().helloWorldFromTheEconomyClass();
    }
}
