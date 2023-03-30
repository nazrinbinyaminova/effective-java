package com.example.effective_java.chapter_2_create_destroy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
@RequestMapping
public class NonStaticFieldMemoryEffect {
    private static final Random random = new Random();

    @GetMapping("/non-static-field")
    public static void testNonStatic() {
        ArrayList<Integer> randomNumbers = new ArrayList<>(1000000);
        long start = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            randomNumbers.add(random.nextInt());
        }

        for (Integer val : randomNumbers) {
           System.out.println(val);
        }

        long end = System.nanoTime();
        System.out.println(end - start);
        // 14043100
        // 10053400
        // 9935000
    }
}
