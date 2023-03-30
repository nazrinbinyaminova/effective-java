package com.example.effective_java.chapter_2_create_destroy.singleton_pattern;

public class SingletonStaticFactoryMethod {
    private static final SingletonStaticFactoryMethod instance = new SingletonStaticFactoryMethod();
    private SingletonStaticFactoryMethod(){}

    public static SingletonStaticFactoryMethod getInstance(){
        return instance;
    }

    private void leaveTheBuilding(){}
}
