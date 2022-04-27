package ru.rt.payment.service.payment;

import ru.rt.payment.model.Payment;

// Interface for paying for things, pay shekels
public interface PaymentCash {
    void pay(Payment payment);
}
