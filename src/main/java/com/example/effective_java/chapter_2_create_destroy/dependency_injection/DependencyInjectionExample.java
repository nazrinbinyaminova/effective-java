package com.example.effective_java.chapter_2_create_destroy.dependency_injection;

import java.util.Objects;

public class DependencyInjectionExample {
    private final InjectableClass injectableClass;

    public DependencyInjectionExample(InjectableClass injectableClass){
        this.injectableClass = Objects.requireNonNull(injectableClass);
    }
}
