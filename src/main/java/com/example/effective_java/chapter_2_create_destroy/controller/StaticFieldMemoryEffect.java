package com.example.effective_java.chapter_2_create_destroy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
@RequestMapping
public class StaticFieldMemoryEffect {
    private static final Random random = new Random();

    // static field create memory loading every call
    private static final ArrayList<Integer> randomNumbers = new ArrayList<>(1000000);

    @GetMapping("/static-field")
    public static void testStatic() {
        long start = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            randomNumbers.add(random.nextInt());
        }

        for (Integer val : randomNumbers) {
            System.out.println(val);
        }

        long end = System.nanoTime();
        System.out.println(end - start);
        // 11679800
        // 12758100
        // 13329100
        // 9683100
    }
}
