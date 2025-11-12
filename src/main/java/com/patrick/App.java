package com.patrick;

public class App {

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static String greetDefault() {
        return greet("World");
    }

    public static void main(String[] args) {
        System.out.println(greetDefault());
    }
}
