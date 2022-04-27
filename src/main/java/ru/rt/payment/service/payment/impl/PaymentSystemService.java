package ru.rt.payment.service.payment.impl;

import ru.rt.payment.model.Order;
import ru.rt.payment.model.Payment;
import ru.rt.payment.repository.PaymentDao;
import ru.rt.payment.service.order.OrderServiceImpl;
import ru.rt.payment.service.payment.PaymentService;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public class PaymentSystemService {
    private final OrderServiceImpl orderService = new OrderServiceImpl();

    private final PaymentService paymentService = new DefaultPayment();

    private final ReturnCashService cashService = new ReturnCashService();

    private PaymentDao paymentDao;

    public PaymentEnum findPayment(final Payment payment) {
//        find the system through which the payment create
        return null;
    }

    public void makeOrder(Order order, PaymentEnum type) {
        orderService.createOrder(order);
        Payment payment = createPayment(order);
        paymentService.pay(payment, type);
    }

    public void makeReturnPayment(Payment payment) {
        paymentService.refund(payment, findPayment(payment));
    }

    public void createPayment(Payment payment) {
        paymentDao.create(payment);
    }

    public void updatePayment(Payment payment) {
        paymentDao.update(payment);
    }

    public void findAllPayment(Payment payment) {
        paymentDao.findAll();
    }

    private Payment createPayment(Order order) {
//        Create Payment instance based on order object
        return null;
    }
}
