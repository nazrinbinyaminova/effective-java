package com.example.patterns.creation_patterns.abstract_factory;

public class MacButton implements Button {
    @Override
    public String render() {
        return "Hello Mac Users!";
    }
}
