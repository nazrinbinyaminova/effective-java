package com.example.effective_java.chapter_6_enums_annotations.annotation_over_naming_39.repeatable;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ExceptionTest.List.class)
public @interface ExceptionTest {
    Class<? extends Throwable> value();

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface List{
        ExceptionTest[] value();
    }
}
