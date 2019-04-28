# Devflection JAR example project

This is an example project that shows how to create an executable JAR file
that depends on some external libraries (logging, util library).

## How to build the jar

First cd into the base directory

    cd JarProject
    
Create a new target folder

    mkdir target
    
Compile source files into target folder

	javac src/main/java/com/devflection/jars/App.java -cp lib/commons-lang3-3.8.1.jar;lib/logback-classic-1.2.3.jar;lib/logback-core-1.2.3.jar;lib/slf4j-api-1.7.26.jar -sourcepath src/main/java -d target

Copy the log config file into target folder

   	cp src/main/resources/logback.xml target/logback.xml

Create the JAR fle

   	jar cfm DevflectionExampleJar.jar ManifestInput.txt -C target .

Run the jar with

    java -jar DevflectionExampleJar.jar 