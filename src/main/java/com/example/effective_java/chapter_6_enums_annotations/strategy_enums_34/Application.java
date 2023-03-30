package com.example.effective_java.chapter_6_enums_annotations.strategy_enums_34;

public class Application {
    public static void main(String[] args) {
        double earthWeight = 6.67300;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }
}
