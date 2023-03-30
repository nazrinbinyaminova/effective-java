package com.example.effective_java.chapter_6_enums_annotations.strategy_enums_34;

import static com.example.effective_java.chapter_6_enums_annotations.strategy_enums_34.PayrollDayEnum.PaymentType.WEEKDAY;
import static com.example.effective_java.chapter_6_enums_annotations.strategy_enums_34.PayrollDayEnum.PaymentType.WEEKEND;

// The strategy enum pattern
public enum PayrollDayEnum {
    MONDAY(WEEKDAY), TUESDAY(WEEKDAY), WEDNESDAY(WEEKDAY), THURSDAY(WEEKDAY),
    FRIDAY(WEEKDAY), SATURDAY(WEEKEND), SUNDAY(WEEKEND);

    private final PaymentType paymentType;

    PayrollDayEnum(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    int pay(int minutesWorked, int payRate) {
        return paymentType.pay(minutesWorked, payRate);
    }

    // The strategy enum type
    enum PaymentType {
        WEEKDAY {
            @Override
            int pay(int minutesWorked, int payRate) {
                return minutesWorked * payRate;
            }
        },
        WEEKEND {
            @Override
            int pay(int minutesWorked, int payRate) {
                return minutesWorked * payRate * 2;
            }
        };

        abstract int pay(int minutesWorked, int payRate);
    }

    public static void main(String... args) {
        for (PayrollDayEnum salary : values())
            System.out.printf("%s : %s %n", salary, salary.pay(5, 10));
    }
}
