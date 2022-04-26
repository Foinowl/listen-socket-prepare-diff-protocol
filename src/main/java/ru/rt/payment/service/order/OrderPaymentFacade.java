package ru.rt.payment.service.order;

import ru.rt.payment.model.Order;
import ru.rt.payment.service.payment.PaymentService;
import ru.rt.payment.service.payment.impl.CashService;
import ru.rt.payment.service.payment.impl.PaymentServiceImpl;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public class OrderPaymentFacade {
    private final OrderServiceImpl orderService = new OrderServiceImpl();

    private final PaymentService paymentService = new PaymentServiceImpl();

    private final CashService cashService = new CashService();

    public void makeOrder(Order order, PaymentEnum type) {
        orderService.createOrder(order);
        paymentService.pay(order, type);
    }

    public void makeReturnOrder(Order order) {
        cashService.cash(order);
    }
}
