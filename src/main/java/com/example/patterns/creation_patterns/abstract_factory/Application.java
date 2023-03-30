package com.example.patterns.creation_patterns.abstract_factory;

import com.example.patterns.creation_patterns.factory.Button;
import com.example.patterns.creation_patterns.factory.Factory;
import com.example.patterns.creation_patterns.factory.WindowsFactory;

public class Application {
    private final Button button;

    public Application(Factory factory) {
        button = factory.createButton();
    }

    public static void main(String[] args) {
        Application app = new Application(new WindowsFactory());

        System.out.println(app.button.render());
    }
}
