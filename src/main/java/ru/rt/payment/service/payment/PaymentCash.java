package ru.rt.payment.service.payment;

import ru.rt.payment.model.Order;

// Interface for paying for things, pay shekels
public interface PaymentCash {
    void pay(Order order);
}
