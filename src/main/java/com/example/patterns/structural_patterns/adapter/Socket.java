package com.example.patterns.structural_patterns.adapter;

public class Socket {
    public Socket() {

    }

    public void plugInEquipment(Appliance appliance) {
        System.out.printf("Equipment is working with %sV voltage!%n", appliance.getVoltage());
    }
}
