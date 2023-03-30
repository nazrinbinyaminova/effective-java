package com.example.effective_java.chapter_12_serialization.defensive_copy;

import java.util.Date;

public final class DefensiveCopy {
    private final Date startDate;
    private final Date endDate;
    private final String name;

    public DefensiveCopy(Date startDate, Date endDate, String name) {
        this.startDate = new Date(startDate.getTime());
        this.endDate = new Date(endDate.getTime());
        this.name = name;

        if (this.startDate.after(this.endDate)) {
            throw new IllegalArgumentException(startDate + " is after " + endDate);
        }
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DefensiveCopy{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", name='" + name + '\'' +
                '}';
    }
}
