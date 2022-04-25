package ru.rt.payment.service.payment;

import ru.rt.payment.model.Order;

public interface PaymentSystem3DSecure extends PaymentSystem {
    void make3DSecure(Order order);
}
