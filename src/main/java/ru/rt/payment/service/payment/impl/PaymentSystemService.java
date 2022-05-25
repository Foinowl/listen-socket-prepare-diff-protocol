package ru.rt.payment.service.payment.impl;

import java.util.Date;
import ru.rt.payment.core.data.Request;
import ru.rt.payment.core.data.Response;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.Payment;
import ru.rt.payment.model.ReturnPayment;
import ru.rt.payment.repository.OrderDao;
import ru.rt.payment.repository.PaymentDao;
import ru.rt.payment.repository.ReturnDao;
import ru.rt.payment.service.order.OrderService;
import ru.rt.payment.service.order.OrderServiceImpl;
import ru.rt.payment.service.payment.PaymentSystem;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public class PaymentSystemService {
    private final OrderService orderService = new OrderServiceImpl();
    private PaymentDao paymentDao;

    private OrderDao orderDao;

    private ReturnDao returnDao;

    private PaymentSystem<Request, Response> paymentSystem;
    public void getAllReturnPayment() {
        returnDao.findAll();
    }

    public PaymentEnum findPayment(final Payment payment) {
//        find the system through which the payment create
        return null;
    }

    public void makeOrder(Order order, PaymentEnum type) {
        orderService.createOrder(order);
        Payment payment = createPayment(order);
        createPayment(payment);
    }

    public void createPayment(Payment payment) {
        paymentDao.create(payment);


        paymentSystem.pay(new Request<>() {
            @Override
            public Object getData(final Class<?> clazz) {
                return payment;
            }

            @Override
            public Object getData(final String name) {
                return payment;
            }
        }, new Response() {
            @Override
            public void setData(final Class<?> clazz) {

            }
            @Override
            public void setData(final String name) {

            }
        });
    }

    public void updatePayment(Payment payment) {
        paymentDao.update(payment);
    }

    public void findAllPayment(Payment payment) {
        paymentDao.findAll();
    }

    private Payment createPayment(Order order) {
//        orderService.calculateOrderCostByProducts(order);
//        Create Payment instance based on order object
        return null;
    }

    public ReturnPayment findReturnPayment() {
        return null;
    }

    public void createReturnPayment(Payment payment) {
//        create instance of return payment
        returnDao.create(new ReturnPayment(12L, payment, new Date()));
    }

}
