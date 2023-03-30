package com.example.effective_java.chapter_6_enums_annotations.enum_map_37;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Plant {
    private final String name;
    private final Lifecycle lifecycle;

    public enum Lifecycle {ANNUAL, BIENNIAL, PERENNIAL}

    public Plant(String name, Lifecycle lifecycle) {
        this.name = name;
        this.lifecycle = lifecycle;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", lifecycle=" + lifecycle +
                '}';
    }

    public static void main(String[] args) {
        Plant[] garden = {new Plant("Basil", Lifecycle.ANNUAL)};

        Set<Plant>[] plantsByLifeCycle =
                (Set<Plant>[]) new Set[Plant.Lifecycle.values().length];
        for (int i = 0; i < plantsByLifeCycle.length; i++)
            plantsByLifeCycle[i] = new HashSet<>();
        for (Plant p : garden)
            plantsByLifeCycle[p.lifecycle.ordinal()].add(p);

        // Print the results
        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n",
                    Plant.Lifecycle.values()[i], plantsByLifeCycle[i]);
        }

        Map<Lifecycle, Set<Plant>> plantsByLifecycle = new EnumMap<>(Lifecycle.class);

        for (Lifecycle lifecycle : Lifecycle.values())
            plantsByLifecycle.put(lifecycle, new HashSet<>());

        for (Plant p : garden)
            plantsByLifecycle.get(p.lifecycle).add(p);

        System.out.println(plantsByLifecycle);

        // Naive stream-based approach - unlikely to produce an EnumMap!
        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifecycle)));


        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifecycle,
                () -> new EnumMap<>(Lifecycle.class), toSet())));


    }
}
