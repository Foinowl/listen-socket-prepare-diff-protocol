package ru.rt.payment.service;

import ru.rt.payment.model.Order;

public interface PaymentSystem extends PaymentCash, ReturnCash{
    void make3DSecure();
}
