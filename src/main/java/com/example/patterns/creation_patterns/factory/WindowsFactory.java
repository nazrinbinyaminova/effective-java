package com.example.patterns.creation_patterns.factory;

public class WindowsFactory extends Factory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
