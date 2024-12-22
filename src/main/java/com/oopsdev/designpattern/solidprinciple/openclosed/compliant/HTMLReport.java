package com.oopsdev.designpattern.solidprinciple.openclosed.compliant;

public class HTMLReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating HTML report...");
    }
}
