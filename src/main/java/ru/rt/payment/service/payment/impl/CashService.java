package ru.rt.payment.service.payment.impl;

import ru.rt.payment.model.Order;
import ru.rt.payment.repository.OrderDao;
import ru.rt.payment.service.payment.PaymentService;
import ru.rt.payment.service.payment.ReturnCash;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

// Сервис ответственен за любые манипуляции с возвращением денег
public class CashService implements ReturnCash {

    private PaymentService paymentService;

    private OrderDao orderDao;

    public PaymentEnum findPayment(final Order order) {
//        находим систему через которую проводили платеж
        return null;
    }

    @Override
    public void cash(final Order order) {
        paymentService.cash(order, findPayment(order));
    }
}
