package com.oopsdev.designpattern.solidprinciple.singleresponsibility.compliant;

public class UserActivityLogger {
    public void logUserActivity(User user) {
        // Log user activity
        System.out.println("Logging activity for user: " + user.getName());
    }
}
