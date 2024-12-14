package com.oopsdev.designpattern.strategy.one;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("John Doe", "1234567890123456"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com"));
        cart.checkout(200);
    }
}
