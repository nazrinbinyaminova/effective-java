package com.example.patterns.structural_patterns.bridge;

public class Application {
    public static void main(String[] args) {
        Radio radio = new Radio();
        TV tv = new TV();

        BasicRemote radioBasic = new BasicRemote(radio);
        BasicRemote tvBasic = new BasicRemote(tv);
        radioBasic.power();
        tvBasic.power();

        AdvancedRemote radioAdvanced = new AdvancedRemote(radio);
        AdvancedRemote tvAdvanced = new AdvancedRemote(tv);
        radioAdvanced.power();
        radioAdvanced.plugOut();

        tvAdvanced.power();
        tvAdvanced.plugOut();
    }
}
