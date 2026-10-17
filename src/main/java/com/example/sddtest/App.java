package com.example.sddtest;

/** Entry point. Features are added through specs in {@code specs/} and changes in {@code openspec/}. */
public class App {

    static String greeting() {
        return "Hello from SDDTest";
    }

    public static void main(String[] args) {
        System.out.println(greeting());
    }
}
