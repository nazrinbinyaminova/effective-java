package com.example.effective_java.chapter_2_create_destroy.avoid_unnecessary_objects;

public class Application {
    public static void main(String... args) {
        long start = System.nanoTime();
        System.out.println(UnnecessaryObjects.isRomanNumeral("test")); //13737900 //13848500
        long end = System.nanoTime();

        System.out.println(end - start);
    }
}
