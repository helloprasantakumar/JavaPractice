package com.solid.OpenClosedPrinciple;

public class PaymentService {
    public void processPayment(Payment payment){
        payment.pay();
    }

    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.processPayment(new CreditCardPayment());
        service.processPayment(new UpiPayment());
        service.processPayment(new PaypalPayment());
    }
}
