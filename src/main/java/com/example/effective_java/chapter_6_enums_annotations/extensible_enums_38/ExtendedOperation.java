package com.example.effective_java.chapter_6_enums_annotations.extensible_enums_38;

public enum ExtendedOperation implements Operation {
    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;

    ExtendedOperation(String symbol) {

        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
