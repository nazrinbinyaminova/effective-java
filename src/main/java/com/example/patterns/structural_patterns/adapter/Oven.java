package com.example.patterns.structural_patterns.adapter;

public class Oven implements Appliance{
    @Override
    public int getVoltage() {
        return 25;
    }
}
