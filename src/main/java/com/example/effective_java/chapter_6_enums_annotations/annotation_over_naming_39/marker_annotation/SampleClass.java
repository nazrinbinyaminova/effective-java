package com.example.effective_java.chapter_6_enums_annotations.annotation_over_naming_39.marker_annotation;

public class SampleClass {
    @Test
    public void m1(){
        System.out.println("m1 working");
        throw new IllegalArgumentException();
    }

    public void m2(){
        System.out.println("m2 working");
        throw new IllegalArgumentException();
    }

    @Test
    public static void m3(){
        System.out.println("m3 working");
        throw new IllegalArgumentException();
    }

    public static void m4(){
        System.out.println("m4 working");
        throw new ClassCastException();
    }

    @Test
    public static void m5(){
        System.out.println("m5 working");
    }
}
