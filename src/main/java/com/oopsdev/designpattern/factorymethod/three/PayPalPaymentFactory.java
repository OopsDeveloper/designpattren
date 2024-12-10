package com.oopsdev.designpattern.factorymethod.three;

class PayPalPaymentFactory extends PaymentFactory {
    @Override
    Payment createPayment(FinancialInfo info) {
        return new PayPalPayment(info.payPalEmail);
    }
}
