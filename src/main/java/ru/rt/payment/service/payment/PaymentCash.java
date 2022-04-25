package ru.rt.payment.service.payment;

import ru.rt.payment.model.Order;

public interface PaymentCash {
    void pay(Order order);

}
