package ru.rt.payment.service;

import ru.rt.payment.model.Order;

public interface ReturnCash {
    void cash(Order order);
}
