package com.oopsdev.designpattern.solidprinciple.openclosed.compliant;

public class XMLReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating XML report...");
    }
}
