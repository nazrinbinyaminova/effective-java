package com.example.patterns.structural_patterns.decorator;

public class NarrowReportDecorator extends ReportDecorator {
    public NarrowReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getContent() {
        return ReportUtil.getStripeContent(super.getContent());
    }
}
