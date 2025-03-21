package com.oopsdev.designpattern.strategy.one;

public class ShoppingCart {
    //해당 인터페이스를 적용한 두 클래스 중 하나가 들어 갈 수 있다.(CreditCardPayment, PayPalPayment)
    private PaymentStrategy paymentStrategy;

    //paymentStrategy 필드를 언제든 다른 전략으로 대체할 수 있또록 setter 메소드가 마련되어 있다.
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //checkout을 실행하면 현재 장착된 전략 객체의 pay메소드가 실행된다.
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
