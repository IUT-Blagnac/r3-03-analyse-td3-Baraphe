package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    // Test pour l'exigence 1: HelloWorld
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.hello();
        assertEquals("Hello World!", result);
    }

    // Test pour l'exigence 2: Echo
    public void testHelloEcho() {
        HelloWorld helloWorld = new HelloWorld();
        String inputParam = "Bonjour le monde!";
        String result = helloWorld.hello(inputParam);
        assertEquals(inputParam, result);
    }
}

