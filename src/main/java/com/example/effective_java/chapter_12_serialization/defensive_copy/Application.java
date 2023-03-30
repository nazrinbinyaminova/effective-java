package com.example.effective_java.chapter_12_serialization.defensive_copy;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Date startDate =  new Date();
        Date endDate =  new Date();
        DefensiveCopy obj = new DefensiveCopy(startDate, endDate, "test");

        System.out.println(obj);
        endDate.setYear(5);
        System.out.println(obj);

    }
}
