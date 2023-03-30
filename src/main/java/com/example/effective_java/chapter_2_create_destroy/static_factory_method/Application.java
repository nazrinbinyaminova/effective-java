package com.example.effective_java.chapter_2_create_destroy.static_factory_method;

public class Application {
    public static void main(String... args) {
        System.out.println(StaticFactoryMethodExample.getInstance().hashCode());
        System.out.println(StaticFactoryMethodExample.getInstance().hashCode());
    }
}
