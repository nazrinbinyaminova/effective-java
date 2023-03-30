package com.example.effective_java.chapter_6_enums_annotations.extensible_enums_38;

public class Application {
    public static void main(String[] args) {
        calculate(ExtendedOperation.class, 5, 10);
        calculate(BasicOperationEnum.class, 6, 11);
    }

    private static <T extends Enum<T> & Operation> void calculate(Class<T> operation,
                                                                  double x, double y) {
        for (Operation op : operation.getEnumConstants()) {
            System.out.printf("%s %s %s = %s \n", x, op, y, op.apply(x, y));
        }
    }
}
