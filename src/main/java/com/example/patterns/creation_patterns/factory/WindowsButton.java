package com.example.patterns.creation_patterns.factory;

public class WindowsButton implements Button{
    @Override
    public String render() {
        return "Hello Windows Users!";
    }
}
