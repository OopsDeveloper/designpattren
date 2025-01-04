package com.oopsdev.designpattern.solidprinciple.openclosed.noncompliant;

public class ReportGenerator {
    public void generateReport(String type) {
        if (type.equals("PDF")) {
            System.out.println("Generating PDF report...");
        } else if (type.equals("HTML")) {
            System.out.println("Generating HTML report...");
        }
        // If we need to add another format, we have to modify this method.
    }

    /*
     * -문제점
     * 새로운 케이스들이 추가되면서 이 메소드의 코드는 보다 장황해지고 복잡해진다.
     * 그 과정에서 실수로 기존 과정에 영향을 주게 될 수도 있고 이 메소드가 이미 사용되던 곳들에도 부작용이 발생할 수 있다.
     * */
}
