package ru.yandex.demo;

public class InheritageQuiz {
    public static void main(String[] args) {
        Report report = new YearlyReport();
        String name = "main";
        System.out.println(report.getName());
    }
}

class Report {
    protected String name = "report";

    public String getName() {
        return "report2";
    }
}

class YearlyReport extends Report {
    public String getName() {
        return name;
    }
}
