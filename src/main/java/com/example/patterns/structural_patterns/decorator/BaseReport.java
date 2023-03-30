package com.example.patterns.structural_patterns.decorator;

public class BaseReport implements Report {
    private final String content;

    public BaseReport(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
