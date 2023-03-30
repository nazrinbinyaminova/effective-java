package com.example.patterns.creation_patterns.factory;

public class MacFactory extends Factory{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
