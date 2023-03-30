package com.example.effective_java.chapter_6_enums_annotations.enumset_over_bit_36;

import java.util.EnumSet;
import java.util.Set;

public class Text {
    public static final int STYLE_BOLD = 1 << 0; // 1
    public static final int STYLE_ITALIC = 1 << 1; // 2
    public static final int STYLE_UNDERLINE = 1 << 2; // 4
    public static final int STYLE_STRIKETHROUGH = 1 << 3; // 8

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    // Parameter is bitwise OR of zero or more STYLE_ constants
    public void applyStylesBad(int styles) {
        System.out.println(styles);
    }

    public void applyStylesGood(Set<Style> styles) {
        System.out.println(styles);
    }

    public static void main(String[] args) {
        // bad usage of bitwise
        new Text().applyStylesBad(STYLE_BOLD | STYLE_ITALIC);

        // good usage of enum
        new Text().applyStylesGood(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
