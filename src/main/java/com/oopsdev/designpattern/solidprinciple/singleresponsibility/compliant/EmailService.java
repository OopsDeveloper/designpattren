package com.oopsdev.designpattern.solidprinciple.singleresponsibility.compliant;

public class EmailService {
    public void sendWelcomeEmail(User user) {
        // Send welcome email to user
        System.out.println("Welcome email sent to: " + user.getEmail());
    }
}
