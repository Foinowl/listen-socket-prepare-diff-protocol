package ru.rt.payment.service.payment.impl;

import ru.rt.payment.service.payment.PaymentSystem;

public class PaymentSystemFactory {

    public static PaymentSystem getPaymentSystem(PaymentEnum type) {
        return type.getInstantiator();
    }
}
