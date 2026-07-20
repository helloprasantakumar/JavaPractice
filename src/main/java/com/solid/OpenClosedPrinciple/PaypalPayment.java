package com.solid.OpenClosedPrinciple;

public class PaypalPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paypal Payment");
    }
}
