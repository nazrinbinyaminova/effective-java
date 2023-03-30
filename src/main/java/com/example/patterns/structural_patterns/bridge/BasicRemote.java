package com.example.patterns.structural_patterns.bridge;

public class BasicRemote implements Remote {
    protected final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnable()) {
            device.disable();
        } else {
            device.enable();
        }
    }
}
