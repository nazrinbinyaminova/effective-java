package com.example.patterns.structural_patterns.adapter;

public class Iron implements Appliance{
    @Override
    public int getVoltage() {
        return 20;
    }
}
