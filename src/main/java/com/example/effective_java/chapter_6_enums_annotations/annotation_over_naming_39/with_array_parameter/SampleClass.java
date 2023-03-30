package com.example.effective_java.chapter_6_enums_annotations.annotation_over_naming_39.with_array_parameter;

public class SampleClass {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int a = 5 / 0;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        throw new IllegalArgumentException();
    }

    @ExceptionTest({ArithmeticException.class, NegativeArraySizeException.class})
    public static void m3() {
        throw new NegativeArraySizeException();
    }
}
