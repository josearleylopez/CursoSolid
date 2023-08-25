package com.principles.dependency_inversion.good;

public class Paypal implements IPaymentMethod {

    @Override
    public void pay(Shopping shopping) {
// Performs payment using Paypal account
    }
}
