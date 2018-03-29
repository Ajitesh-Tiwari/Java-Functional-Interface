package com.functional.java;

public class Main {

    public static void main(String[] args) {
        watchBreakingBad("Walter White", System.out::println);
        watchBreakingBad("Jesse Pinkman", System.out::println);
    }

    private static void watchBreakingBad(String name, BreakingBad breakingBad) {
        breakingBad.sayMyName("My name is ".concat(name));
    }
}
