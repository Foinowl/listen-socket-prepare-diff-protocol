package ru.rt.payment.service.payment.impl;

import ru.rt.payment.model.Order;
import ru.rt.payment.service.payment.PaymentService;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public void pay(final Order order, final PaymentEnum type) {
        PaymentService.super.pay(order, type);
    }

    @Override
    public void cash(final Order order, final PaymentEnum type) {
        PaymentService.super.cash(order, type);
    }
}
