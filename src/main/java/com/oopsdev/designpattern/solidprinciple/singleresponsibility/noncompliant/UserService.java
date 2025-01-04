package com.oopsdev.designpattern.solidprinciple.singleresponsibility.noncompliant;

public class UserService {
    public void saveUser(User user) {
        // Save user to database
        System.out.println("User saved to database: " + user.getName());
    }

    public void sendWelcomeEmail(User user) {
        // Send welcome email to user
        System.out.println("Welcome email sent to: " + user.getEmail());
    }

    public void logUserActivity(User user) {
        // Log user activity
        System.out.println("Logging activity for user: " + user.getName());
    }

    /*
    * -문제점
    * 각 클래스의 코드가 복잡해지고 이들의 역할을 직관적으로 이해하기 어려워진다.
    * 가진 책임의 개수만큼 수정할 이유가 많아지는데 그 책임들 중 하나를 수정하는 일이 다른 책임에 의도치 않는 영향을 끼칠 수 있다.
    * 여러 책임이 한 곳에 얽혀 있기 때문에 테스트와 리팩토링도 까다로워지며 확장성과 유연성에 있어서도 제약이 생긴다.
    * 즉 필요한 것만 분리해서 가져다 쓸 수가 없다.
    * */
}
