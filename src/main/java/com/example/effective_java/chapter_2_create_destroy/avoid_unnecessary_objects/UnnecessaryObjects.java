package com.example.effective_java.chapter_2_create_destroy.avoid_unnecessary_objects;

import java.util.regex.Pattern;

public class UnnecessaryObjects {
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    // create Pattern object every time
    public static boolean isRomanNumeralBadPractice(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    public static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
