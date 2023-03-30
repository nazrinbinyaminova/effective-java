package com.example.effective_java.chapter_2_create_destroy.singleton_pattern;

public class SingletonPublicFinalField {
    public static final SingletonPublicFinalField instance = new SingletonPublicFinalField();

    private SingletonPublicFinalField() {
    }

    private void leaveTheBuilding() {
    }
}
