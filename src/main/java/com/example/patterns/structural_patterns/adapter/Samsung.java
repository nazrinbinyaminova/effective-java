package com.example.patterns.structural_patterns.adapter;

public class Samsung implements Phone{
    @Override
    public int phoneVoltage() {
        return 15;
    }

    @Override
    public String modelName() {
        return "Samsung";
    }
}
