package com.example.patterns.structural_patterns.decorator;

public abstract class ReportDecorator implements Report {
    private final Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    @Override
    public String getContent(){
        return report.getContent();
    }
}
