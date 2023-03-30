package com.example.effective_java.chapter_2_create_destroy.utility;

// utility classes have private constructor and just a grouping of static methods and static fields.
// Attempting to enforce non-instantiability by making a class abstract does not work. The class can be subclassed and the subclass instantiated
public class UtilityClass {
    private UtilityClass(){
        throw new AssertionError("No java.util.Objects instances for you!");
    }

//    Collections is a utility class
}
