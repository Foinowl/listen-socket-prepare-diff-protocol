package ru.rt.payment.service.payment;

import ru.rt.payment.model.Order;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public interface PaymentService {
    default void pay(Order order, PaymentEnum type) {
        type.getInstantiation().pay(order);
    }

    default void cash(Order order, PaymentEnum type) {
        type.getInstantiation().cash(order);
    }

}
