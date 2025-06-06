package com.oopsdev.designpattern.factorymethod.three;

class FinancialInfo {
    String creditCardNumber;
    String payPalEmail;
    String bankAccountNumber;

    public FinancialInfo(
            String creditCardNumber
            , String payPalEmail
            , String bankAccountNumber) {
        this.creditCardNumber = creditCardNumber;
        this.payPalEmail = payPalEmail;
        this.bankAccountNumber = bankAccountNumber;
    }
}
