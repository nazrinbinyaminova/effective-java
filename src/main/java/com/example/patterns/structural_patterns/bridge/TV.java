package com.example.patterns.structural_patterns.bridge;

public class TV implements Device{
    private boolean on = false;

    @Override
    public boolean isEnable() {
        return this.on;
    }

    @Override
    public void enable() {
        System.out.println("Turned on!");
        this.on = true;
    }

    @Override
    public void disable() {
        System.out.println("Turned off!");
        this.on = false;
    }
}
