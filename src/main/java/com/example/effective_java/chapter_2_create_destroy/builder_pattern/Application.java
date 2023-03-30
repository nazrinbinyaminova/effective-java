package com.example.effective_java.chapter_2_create_destroy.builder_pattern;

import java.time.LocalDateTime;

public class Application {
    public static void main(String... args) {
        System.out.println(Animal.builder().species("a").birth(LocalDateTime.now()).name("c").build());
    }
}
