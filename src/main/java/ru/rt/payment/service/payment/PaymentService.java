package ru.rt.payment.service.payment;

import ru.rt.payment.model.Payment;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public interface PaymentService {
    default void pay(Payment payment, PaymentEnum type) {
        type.getInstantiation().pay(payment);
    }

    default void refund(Payment payment, PaymentEnum type) {
        type.getInstantiation().refund(payment);
    }

}
