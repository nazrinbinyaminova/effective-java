package com.example.patterns.structural_patterns.bridge;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void plugOut() {
        super.device.disable();
    }
}
