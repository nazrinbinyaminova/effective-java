package com.example.effective_java.chapter_6_enums_annotations.not_use_ordinal_35;

public enum ColorEnum {
    WHITE(1), BLACK(2), BLUE(3);

    private final int number;

    ColorEnum(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String... args){
        System.out.println(WHITE.getNumber());

        // It is not recommended
        System.out.println(WHITE.ordinal());
    }
}
