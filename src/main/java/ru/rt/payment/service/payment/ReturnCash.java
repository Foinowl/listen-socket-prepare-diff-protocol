package ru.rt.payment.service.payment;

import ru.rt.payment.model.Payment;

// An interface that returns the cost based on a historical payment
public interface ReturnCash {
    void refund(Payment payment);
}
