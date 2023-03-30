package com.example.patterns.creation_patterns.singleton;

public class SingletonPattern {
    private static SingletonPattern singleton;

    private SingletonPattern() {
        System.out.println("Instance created!");
    }

    public static SingletonPattern getInstance() {
        if (singleton == null) {
            synchronized (SingletonPattern.class) {
                singleton = new SingletonPattern();
            }
        }

        return singleton;
    }

    public static void main (String... args){
        SingletonPattern.getInstance();
        SingletonPattern.getInstance();
        SingletonPattern.getInstance();
        SingletonPattern.getInstance();
    }
}
