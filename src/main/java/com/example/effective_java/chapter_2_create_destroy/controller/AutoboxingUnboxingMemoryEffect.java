package com.example.effective_java.chapter_2_create_destroy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AutoboxingUnboxingMemoryEffect {
    @GetMapping("boxing-unboxing")
    public Long createUnnecessaryObjects() {
        long start = System.nanoTime();
        // 7603594700
        Long sum1 = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum1 += i;
        }
        // 656724800
        // use primitive type over wrapper classes such as Long
        long sum = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        return sum;
    }
}
