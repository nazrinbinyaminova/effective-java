package com.example.effective_java.chapter_6_enums_annotations.strategy_enums_34;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum OperationEnum {
    PLUS("+") {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLE("*") {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    OperationEnum(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    abstract double apply(double x, double y);

    private static final Map<String, String> stringToEnum = Stream.of(values())
            .collect(Collectors.toMap(Objects::toString, e -> e.name()));

    public static Optional<String> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public static void main(String... args) {
        double x = 15;
        double y = 5;
        for (OperationEnum operation : values()) {
            System.out.printf("%s %s %s = %s%n", x, operation, y, operation.apply(x, y));
        }

        System.out.println(OperationEnum.fromString("+"));
    }
}
