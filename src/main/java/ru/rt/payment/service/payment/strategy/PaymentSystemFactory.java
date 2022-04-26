package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.service.payment.PaymentSystem;

public class PaymentSystemFactory {

    public static PaymentSystem getPaymentSystem(PaymentEnum type) {
        return type.getInstantiation();
    }
}
