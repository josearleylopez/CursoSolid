package com.principles.dependency_inversion.good;

public class CreditCard implements IPaymentMethod {

    @Override
    public void pay(Shopping shopping){
// Performs payment using a credit card
    }
}
