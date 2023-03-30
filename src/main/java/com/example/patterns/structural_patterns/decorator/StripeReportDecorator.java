package com.example.patterns.structural_patterns.decorator;

public class StripeReportDecorator extends ReportDecorator {
    public StripeReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getContent() {
        return ReportUtil.getStripeContent(super.getContent());
    }
}
