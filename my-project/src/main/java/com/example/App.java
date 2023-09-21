package com.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
    }
}

class HelloWorld {
    // Exigence 1: HelloWorld
    public String hello() {
        return "Hello World!";
    }
    
    // Exigence 2: Echo
    public String hello(String param) {
        return param;
    }
}
