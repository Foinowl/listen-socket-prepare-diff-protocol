package ru.rt.payment.service.payment.impl;

import ru.rt.payment.model.Payment;
import ru.rt.payment.service.payment.PaymentService;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public class DefaultPayment implements PaymentService {

    @Override
    public void pay(final Payment payment, final PaymentEnum type) {
        PaymentService.super.pay(payment, type);
    }

    @Override
    public void refund(final Payment payment, final PaymentEnum type) {
        PaymentService.super.refund(payment, type);
    }
}
