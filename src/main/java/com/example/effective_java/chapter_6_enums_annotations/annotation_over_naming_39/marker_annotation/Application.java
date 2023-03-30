package com.example.effective_java.chapter_6_enums_annotations.annotation_over_naming_39.marker_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException {
        int test = 0;
        int passed = 0;
        Class<?> sample = Class.forName("com.example.effective_java.chapter_6_enums_annotations.annotation_over_naming_39.marker_annotation.SampleClass");
        Method[] methods = sample.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                test++;
                try {
                    method.invoke(null);
                    passed++;
                } catch (InvocationTargetException e) {
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        System.out.printf("Passed: %s, Failed: %s", passed, test - passed);
    }
}
