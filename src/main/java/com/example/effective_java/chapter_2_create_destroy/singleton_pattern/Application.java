package com.example.effective_java.chapter_2_create_destroy.singleton_pattern;

public class Application {
    public static void main(String... args) {
        System.out.println(SingletonPublicFinalField.instance.hashCode());
        System.out.println(SingletonPublicFinalField.instance.hashCode());
        System.out.println(SingletonStaticFactoryMethod.getInstance().hashCode());
        System.out.println(SingletonStaticFactoryMethod.getInstance().hashCode());
        System.out.println(SingletonEnum.INSTANCE.hashCode());
        System.out.println(SingletonEnum.INSTANCE.hashCode());
    }
}
