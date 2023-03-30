package com.example.effective_java.chapter_2_create_destroy.controller;

import com.example.effective_java.chapter_2_create_destroy.memory_leak.Stack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ObsoleteObjectMemoryEffect {

    @GetMapping("obsolete-object")
    public void getStack() {
        Stack stack = new Stack();
        for (int i = 0; i < 1000000; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 1000000; i++) {
            // stack.pop();
            stack.popWell();
        }
    }
}
