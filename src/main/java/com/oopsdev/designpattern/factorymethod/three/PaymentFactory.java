package com.oopsdev.designpattern.factorymethod.three;

// Abstract factory class
abstract class PaymentFactory {
    abstract Payment createPayment(FinancialInfo info);
}
