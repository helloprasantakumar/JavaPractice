package com.solid.OpenClosedPrinciple;

public class UpiPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
}
