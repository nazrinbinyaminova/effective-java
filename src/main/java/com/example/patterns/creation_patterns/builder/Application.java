package com.example.patterns.creation_patterns.builder;

public class Application {
    public static void main(String[] args) {
        Student student = Student.builder()
                .age(12).name("Test").grade(2).build();
        System.out.println(student);
    }
}
