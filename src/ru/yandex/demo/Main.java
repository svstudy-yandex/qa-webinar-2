package ru.yandex.demo;

public class Main {
    public static void main(String[] args) {
        Report report = new YearlyReport();
        System.out.println(report.getClass().getSimpleName());
    }
}

class Report {}

class YearlyReport extends Report {}
