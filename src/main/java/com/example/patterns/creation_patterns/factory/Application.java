package com.example.patterns.creation_patterns.factory;

public class Application {
    public static void main(String[] args) {
        Factory factory;
        if (1 < 2) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }
        Button button = factory.createButton();
        System.out.println(button.render());
    }
}
