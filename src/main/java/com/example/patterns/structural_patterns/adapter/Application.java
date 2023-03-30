package com.example.patterns.structural_patterns.adapter;

public class Application {
    public static void main(String[] args) {
        Socket socket = new Socket();

        Appliance iron = new Iron();
        Appliance oven = new Oven();

        socket.plugInEquipment(iron);
        socket.plugInEquipment(oven);

        Phone phone = new Samsung();
        // phone is unacceptable
        //socket.plugInEquipment(phone);

        PhoneApplianceAdapter adapter = new PhoneApplianceAdapter(phone);
        socket.plugInEquipment(adapter);

    }
}
