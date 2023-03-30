package com.example.effective_java.chapter_6_enums_annotations.extensible_enums_38;

public enum BasicOperationEnum implements Operation{
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLE("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };
    private final String symbol;

    BasicOperationEnum(String symbol){

        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
