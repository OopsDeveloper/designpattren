package com.oopsdev.designpattern.factorymethod.three;

class BankTransferPaymentFactory extends PaymentFactory {
    @Override
    Payment createPayment(FinancialInfo info) {
        return new BankTransferPayment(info.bankAccountNumber);
    }
}
