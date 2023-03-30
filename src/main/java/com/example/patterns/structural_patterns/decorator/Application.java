package com.example.patterns.structural_patterns.decorator;

public class Application {
    public static void main(String[] args) {
        String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do" +
                " eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
                " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu " +
                "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa " +
                "qui officia deserunt mollit anim id est laborum.";
        BaseReport report = new BaseReport(content);
        System.out.println(report.getContent());

        NarrowReportDecorator report2 = new NarrowReportDecorator(report);
        System.out.println(report2.getContent());
    }
}
