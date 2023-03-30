package com.example.patterns.structural_patterns.adapter;

public class PhoneApplianceAdapter implements Appliance {

    private final Phone phone;

    public PhoneApplianceAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int getVoltage() {
        return phone.phoneVoltage();
    }
}
